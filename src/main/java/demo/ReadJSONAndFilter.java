package demo;

/**
 * 读取JSON文件，并添加过滤条件
 * @Author: fansy
 * @Time: 2019/3/11 17:55
 * @Email: fansy1990@foxmail.com
 */

import entity.User;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class ReadJSONAndFilter {


    public static class JsonMapper
            extends Mapper<Object, Text, Text, NullWritable>{

        private Text jsonLine = new Text();
        private NullWritable nullWritable = NullWritable.get();

        private static final ObjectMapper mapper = new ObjectMapper();

        public void map(Object key, Text value, Context context
        ) throws IOException, InterruptedException {
           User user =  mapper.readValue(value.toString(), User.class);
           // 添加过滤条件
           if(user.getViews() >= 2 && user.getReputation() >= 20 ){
               jsonLine.set(user.toCustomString());
               context.write(jsonLine, nullWritable);
           }
        }
    }
    public static class FormatReducer
            extends Reducer<Text,NullWritable,Text,NullWritable> {
        private IntWritable result = new IntWritable();

        public void reduce(Text key, Iterable<NullWritable> values,
                           Context context
        ) throws IOException, InterruptedException {

            context.write(key, NullWritable.get());
        }
    }

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "read json and filter data");
        job.setJarByClass(ReadJSONAndFilter.class);
        job.setMapperClass(JsonMapper.class);
        job.setReducerClass(FormatReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        FileSystem.get(conf).delete(new Path(args[1]),true);
        System.exit(job.waitForCompletion(true) ? 0 : 1);

    }
}
