package xml.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;

/**
 * 读取XML，并写入到JSON
 * @Author: fansy
 * @Time: 2019/3/11 16:40
 * @Email: fansy1990@foxmail.com
 */
public class ConvertXml2Json {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/Users.xml";
//        System.out.println(new File(".").getAbsolutePath());
        JSONObject jsonObject =  XML.toJSONObject(new FileReader(new File(fileName)));

        JSONArray jsonArray = jsonObject.getJSONObject("users").getJSONArray("row");

        File fout = new File("src/main/resources/Users.json");
        if(fout.exists()){
            fout.delete();
        }
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (int i =0 ;i < jsonArray.length(); i++) {
            bw.write(jsonArray.getJSONObject(i).toString());
            bw.newLine();
        }

        bw.close();
        fos.close();
        System.out.println("done!");
    }
}
