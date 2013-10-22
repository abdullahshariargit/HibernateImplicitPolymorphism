create table CardPayment (paymentId bigint primary key  , paymentAmount bigint  , paymentCurrency varchar (30), payingAccountNumber varchar(30), transferringBankName varchar(30));
create table CashPayment(paymentId bigint primary key , paymentAmount bigint  , paymentCurrency varchar (30), payerName varchar(30));
create table Student(studentId bigint primary key , firstName varchar(30)  , lastName varchar(30));


drop table cardpayment ;
drop table cashpayment;
drop table student;