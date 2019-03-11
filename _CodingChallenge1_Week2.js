create table Product(

prodId int identity(1,1) primary key,

prodName varchar(50) not null,

prodPrice money not null

)

go

create table Orders(

ordId smallint identity(1,1) primary key,

prodid int identity(1,1) foreign key,

customerId int identity(1,1) foreign key

)

create table Customers(

customerId int identity(1,1) primary key,

firstName varchar(30) not null,

lastName varchar(30) not null,

cardNumber int not null

)

insert into Product(prodId, prodName, prodPrice)
values(1845, 'lenovo desktop', 500.00),
(4729, 'iPhone', 200.00),
(7392, 'Dell tablet', 300.00)

insert into Customers(customerId, firstName, lastName, cardNumber)
values(39738, 'Tina', 'Smith', 57387387385),
(57238, 'John', 'Stewart', 27628403726),
(57265, 'Bob', 'Marley', 295729572652)

insert into Orders(