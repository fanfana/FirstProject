create database springjdbc_test;

use springjdbc_test;

create table m_account(
	name varchar(20) default null,
	money decimal(10,2) default null
);

INSERT INTO M_ACCOUNT(NAME,MONEY)VALUES(“张三”,1000.00);
INSERT INTO M_ACCOUNT(NAME,MONEY)VALUES(“李四”,2000.00);

