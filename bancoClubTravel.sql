drop database if exists club_travel;
create database club_travel;

use club_travel;

create table country(
 id_country bigint(10) primary key auto_increment,
 portuguese_name varchar(100),
 english_name varchar(100),
 image_link varchar(300),
 image blob
);

create table region(
 id_region bigint(10) primary key auto_increment,
 name varchar(100),
 uf varchar(100)
);

create table state(
 id_state bigint(10) primary key auto_increment,
 id_region bigint(10),
 id_country bigint(10),
 uf_code varchar(100),
 name varchar(100),
 uf varchar(100),
 foreign key(id_region) references region(id_region),
 foreign key(id_country) references country(id_country)
);

create table city(
 id_city bigint(10) primary key auto_increment,
 id_state bigint(10),
 ibge_code varchar(100),
 name varchar(100),
 foreign key(id_state) references state(id_state)
);

create table destinations(
 id_destinations bigint(10) primary key auto_increment,
 id_city bigint(10),
 reference varchar(100),
 image_link varchar(300),
 image blob,
 foreign key(id_city) references city(id_city)
);

create table traveler(
 id_traveler bigint(10) primary key auto_increment,
 name varchar(100),
 phone varchar(100),
 email varchar(100),
 image_link varchar(300),
 image blob
);

create table news(
 id_news bigint(10) primary key auto_increment,
 id_traveler bigint(10),
 id_destinations bigint(10),
 title varchar(100),
 subtitle varchar(100),
 text varchar(300),
 date_time datetime,
 image_link varchar(300),
 image blob,
 foreign key(id_traveler) references traveler(id_traveler),
 foreign key(id_destinations) references destinations(id_destinations)
);

create table comments(
 id_comments bigint(10) primary key auto_increment,
 id_traveler bigint(10),
 id_news bigint(10),
 text varchar(300),
 foreign key(id_traveler) references traveler(id_traveler),
 foreign key(id_news) references news(id_news)
);

create table events(
 id_events bigint(10) primary key auto_increment,
 id_destinations bigint(10),
 start_date datetime,
 end_date datetime,
 description varchar(200),
 foreign key(id_destinations) references destinations(id_destinations)
);