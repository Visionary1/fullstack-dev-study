create table `score`(
	`id` int not null auto_increment primary key
    , `name` varchar(8) not null
    , `year` smallint not null
    , `term` char(4) not null
    , `title` varchar(4) not null
    , `score` smallint not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) ENGINE=InnoDB default charset=utf8mb4;

desc `score`;

alter table `score` add column `semester` tinyint not null after `year`;

alter table `score` modify column `name` varchar(32) not null;

alter table `score` change column `title` `subject` varchar(16) not null;

create table `review`(
	`id` int not null auto_increment primary key
    , `store` varchar(8) not null
    , `menu` varchar(8) not null
    , `point` decimal(2, 1) default 3.5 not null -- 4.5 총 두 자리, 소수점 자리수 1
    , `review` varchar(256)
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) ENGINE=InnoDB default charset=utf8mb4;

alter table `review` add column `userName` varchar(32) not null after `menu`;

alter table `review` change column `store` `storeName` varchar(32) not null;

