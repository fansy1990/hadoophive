
## 生成测试数据
for i in {00001..10000};do echo a"$i" >> a.txt;done;

for i in {00001..10000};do echo b"$i" >> b.txt;done;

## 执行flume ng命令
bin/flume-ng agent --conf conf --conf-file /opt/flume/conf/demo.conf --name a1 -Dflume.root.logger=INFO,console