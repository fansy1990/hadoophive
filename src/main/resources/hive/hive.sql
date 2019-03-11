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
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = "|",
   "quoteChar"     = "'",
   "escapeChar"    = "\\"
)
STORED AS TEXTFILE;


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



LOAD DATA  INPATH '/user/root/user_out00/part-r-00000' OVERWRITE INTO TABLE t_user;

LOAD DATA  INPATH '/user/root/part-r-00000' OVERWRITE INTO TABLE t_user;


select t.creationdate,t.views,t.accountid,t.websiteurl,t.lastaccessdate,t.upvotes,t.id,t.reputation,t.downvotes,t.displayname from t_user t limit 20;

select max(reputation) from t_user ;

select count(1) as num, reputation from t_user group by reputation order by num;
