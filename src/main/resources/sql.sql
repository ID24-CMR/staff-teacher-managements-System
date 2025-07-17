CREATE DATABASE sms237;

DROP TABLE EXISTS department;

CREATE TABLE `department` (
  `dep_id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(25) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `yexperience` int(11) DEFAULT NULL,
  PRIMARY KEY (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `contactAdd` varchar(100) DEFAULT NULL,
  `empEmail` varchar(100) DEFAULT NULL,
  `emplPass` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `leave` (
  `lea_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`lea_id`),
  KEY `emp_id_idx` (`emp_id`),
  CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `payroll` (
  `payId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `depId` int(11) DEFAULT NULL,
  `salaryId` int(11) DEFAULT NULL,
  `leaveId` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `report` varchar(255) DEFAULT NULL,
  `ttamount` double DEFAULT NULL,
  PRIMARY KEY (`payId`),
  KEY `emplId_idx` (`empId`),
  KEY `salaryId_idx` (`salaryId`),
  KEY `depId_idx` (`depId`),
  CONSTRAINT `depId` FOREIGN KEY (`depId`) REFERENCES `department` (`depId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `salaryId` FOREIGN KEY (`salaryId`) REFERENCES `salary` (`salaryId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `qualification` (
  `qual_id` int(11) NOT NULL AUTO_INCREMENT,
  `empl_id` int(11) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `requirement` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`qual_id`),
  KEY `emplId_idx` (`emplId`),
  CONSTRAINT `empl_id` FOREIGN KEY (`empl_id`) REFERENCES `employee` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `salary` (
  `salary_id` int(11) NOT NULL AUTO_INCREMENT,
  `depid` int(11) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `anual` int(11) DEFAULT NULL,
  `bonus` double DEFAULT NULL,
  PRIMARY KEY (`salary_id`),
  KEY `depid` (`depid`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`depid`) REFERENCES `department` (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1




insert into department values(4, "Computer Science / IT", "IT teacher or Tech Support", 380000, 2);
insert into department values(5, "Language & Literature", "English or French Teacher", 350000, 2);
insert into department values(6, "History / Geography", "Social Studies Teacher", 340000, 2);
insert into department values(7, "Foriegn", "Language Teacher", 350000, 2);
insert into department values(8, "Arts", "Art or Music Teacher", 320000, 2);
insert into department values(9, "Physical Education", "P.E Teacher", 330000, 2);
insert into department values(10, "Administration", "School Secretary", 300000, 2);
insert into department values(11, "Principal's", "School Principal", 650000, 5);
insert into department values(12, "Finance & Accounting", "School Accountant", 400000, 2);
insert into department values(13, "HR / Personnel", "HR Assistant", 350000, 2);
insert into department values(14, "Admission Office", "Admission Coordinator", 320000, 2);
insert into department values(15, "Library", "Librarian", 330000, 2);
insert into department values(16, "Counseling/Psychology", "School counselor", 450000, 2);
insert into department values(17, "IT Support", "Tech Support Specialist", 350000, 2);
insert into department values(18, "Cafeteria", "Food Service Worker", 250000, 0);
insert into department values(19, "Security", "School Security Officer", 280000, 0);
insert into department values(20, "Maintenance", "Maintenance Worker", 280000, 0);
insert into department values(21, "Transportation", "School Bus Driver", 270000, 1);







