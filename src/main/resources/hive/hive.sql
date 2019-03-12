-- 建表
CREATE TABLE t_user(creationdate string,
 views int,
  accountid int,
  aboutme string,
  websiteurl string,
  lastaccessdate string,
  upvotes int,
  profileimageurl string,
  id int,
  reputation int,
  downvotes int,
  location string,
  displayname string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY "|"
STORED AS TEXTFILE;


-- 导入数据
LOAD DATA  INPATH '/user/root/user_out00/part-r-00000' OVERWRITE INTO TABLE t_user;


-- 查询部分数据
select t.creationdate,t.views,t.accountid,t.websiteurl,t.lastaccessdate,t.upvotes,t.id,t.reputation,t.downvotes,t.displayname from t_user t limit 20;


-- 查询总记录数
select count(1) from t_user;

-- 查询最大reputation
select max(reputation) from t_user ;

-- reputation分组查询
select count(1) as num, reputation from t_user group by reputation order by num;
