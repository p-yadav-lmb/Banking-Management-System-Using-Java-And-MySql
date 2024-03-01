create database bankmanagementsystem;
show databases;
use bankmanagementsystem;
create table signup(formno varchar(20) ,
					name varchar(20) ,
                    father_name varchar(20) ,
                    dob varchar(20) ,
                    gender varchar(20) ,
                    email varchar(30) ,
                    marital_status varchar(20) ,
                    address varchar(40) ,
                    city varchar(25),
                    pincode varchar(20),
                    state varchar(25));

show tables;            
select * from signup;        
create table signuptwo(formno varchar(20)  ,
						religion varchar(20)  ,
                        category varchar(20)  ,
                        income varchar(20)  ,
                        education varchar(20)  ,
                        occupation varchar(20)  ,
                        pan varchar(20)  ,
                        aadhar varchar(20)  ,
                        seniorcitizen varchar(20), 
                        existingaccount varchar(20) ) ;
select * from signuptwo;

create table signupthree(formno varchar(20),
						 accountType varchar(40),
                         cardnumber varchar(20),
                         pin varchar(20),
                         facility varchar(1000));
  select*  from signupthree; 
  truncate table signupthree;
  select * from login;
  desc signupthree;
  
  create table bank(pin varchar(20) ,date varchar(20),type varchar(20), amount varchar(40));
						 