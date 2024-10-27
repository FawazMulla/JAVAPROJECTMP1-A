create database hotelmanagementsystem;

USE hotelmanagementsystem;

create table login(username varchar(20),password varchar(20));
insert into login values('admin','admin123');
select * FROM LOGIN;

create table employee(
	name varchar(20),
    age int,
    gender varchar(20),
    job varchar(20),
    salary varchar(20),
    phone bigint,
    adhaar bigint,
    email varchar(50)
    );
    
    );

INSERT INTO employee (name, age, gender, job, salary, phone, adhaar, email) VALUES
('Raj Sharma', 29, 'Male', 'Manager', '50000', 9876543210, 123456789012, 'raj.sharma@email.com'),
('Pooja Mehta', 34, 'Female', 'Accountant', '45000', 9876543211, 123456789013, 'pooja.mehta@email.com'),
('Amit Patil', 28, 'Male', 'Chef', '55000', 9876543212, 123456789014, 'amit.patil@email.com'),
('Sunita Desai', 25, 'Female', 'Front Desk Clerks', '30000', 9876543213, 123456789015, 'sunita.desai@email.com'),
('Vikram Singh', 33, 'Male', 'Porters', '28000', 9876543214, 123456789016, 'vikram.singh@email.com'),
('Neha Gupta', 27, 'Female', 'Housekeeping', '25000', 9876543215, 123456789017, 'neha.gupta@email.com'),
('Rohan Nair', 32, 'Male', 'Kitchen Staff', '32000', 9876543216, 123456789018, 'rohan.nair@email.com'),
('Anjali Kumar', 29, 'Female', 'Room Service', '27000', 9876543217, 123456789019, 'anjali.kumar@email.com'),
('Arjun Varma', 31, 'Male', 'Waiter/Waitress', '26000', 9876543218, 123456789020, 'arjun.varma@email.com'),
('Deepa Joshi', 35, 'Female', 'Manager', '51000', 9876543219, 123456789021, 'deepa.joshi@email.com'),
('Nikhil Rao', 26, 'Male', 'Accountant', '44000', 9876543220, 123456789022, 'nikhil.rao@email.com'),
('Kavita Kulkarni', 30, 'Female', 'Chef', '56000', 9876543221, 123456789023, 'kavita.kulkarni@email.com'),
('Suresh Yadav', 28, 'Male', 'Front Desk Clerks', '31000', 9876543222, 123456789024, 'suresh.yadav@email.com'),
('Meera Dixit', 29, 'Female', 'Porters', '29000', 9876543223, 123456789025, 'meera.dixit@email.com'),
('Ravi Verma', 33, 'Male', 'Housekeeping', '26000', 9876543224, 123456789026, 'ravi.verma@email.com');
    
select * FROM employee;
drop table EMPLOYEE;
select * from login where username = "admin" and password = "admin123";

create table driver (
	name varchar(20),
    age int,
    gender varchar(10),
    company varchar(25),
    brand varchar(20), 
    available varchar(10) , 
    location varchar(20)
    );
    
select * from driver;
delete from driver;

create table room(
  roomnumber varchar(10),
  availability varchar(20),
  cleaning_status varchar(10),
  price varchar(10),
  bed_type varchar(20)
  );
  
select * from room;
insert into room values(1001,"Available","Cleaned",2000,"DoubleBed");
insert into room values(1002,"Available","UnCleaned",2600,"SingleBed");
insert into room values(1003,"UnAvailable","Cleaned",2250,"SingleBed");
insert into room values(1004,"Available","Cleaned",2000,"SingleBed");
insert into room values(1005,"UnAvailable","UnCleaned",3000,"DoubleBed");
insert into room values(1006,"UnAvailable","UnCleaned",6540,"DoubleBed");
insert into room values(1007,"UnAvailable","UnCleaned",2000,"SigleBed");
insert into room values(1008,"Available","Cleaned",4600,"DoubleBed");
insert into room values(1009,"Available","UnCleaned",7000,"SingleBed");
insert into room values(1010,"Available","Cleaned",6800,"DoubleBed");
insert into room values(1011,"Available","Cleaned",2000,"DoubleBed");
insert into room values(1012,"UnAvailable","UnCleaned",2300,"SingleBed");
insert into room values(1013,"Available","Cleaned",3100,"SingleBed");
insert into room values(1014,"UnAvailable","Cleaned",2500,"SingleBed");
insert into room values(1015,"Available","UnCleaned",2000,"DoubleBed");

create table customer(
	document varchar(25),
	number varchar(30),
	name varchar(20),
	gender varchar(20), 
	country varchar(10),
    room varchar(10),
	checkintime varchar(80), 
	deposit varchar(20)
 );
insert into customer values("Aadhar","12345678914","John","Male","usa","1015","sun 2013","454");
select * from customer;

-- INSERT INTO customer (document, number, name, gender, country, room, checkintime, deposit) VALUES
-- ('Passport', '987654321012', 'Amit Patel', 'Male', 'India', '1001', '2024-10-27 14:30:00', '5000'),
-- ('Passport', '987654321013', 'Sara Khan', 'Female', 'India', '1002', '2024-10-28 15:00:00', '6000'),
-- ('Aadhar Card', '987654321014', 'Ravi Kumar', 'Male', 'India', '1003', '2024-10-28 16:15:00', '4500'),
-- ('Aadhar Card', '987654321015', 'Nina Desai', 'Female', 'India', '1004', '2024-10-28 17:00:00', '7000'),
-- ('Passport', '987654321016', 'Raj Singh', 'Male', 'India', '1005', '2024-10-28 18:30:00', 