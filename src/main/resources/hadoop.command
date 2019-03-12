
## 单词记录+过滤
yarn jar hadoop-hive-1.0-SNAPSHOT.jar demo.WordCountGrep /user/root/README.txt ad /tmp/wc_00

## 执行数据预处理任务
yarn jar hadoop-hive-1.0-SNAPSHOT.jar demo.ReadJSONAndFilter /user/root/Users.json /user/root/user_out00