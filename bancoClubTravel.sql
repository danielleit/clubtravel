drop database if exists club_travel;
create database club_travel;

use club_travel;

create table country(
 id_country bigint primary key auto_increment,
 portuguese_name varchar(100),
 english_name varchar(100),
 image_link varchar(300),
 image mediumblob
);

create table region(
 id_region bigint primary key auto_increment,
 name varchar(100),
 uf varchar(100)
);

create table state(
 id_state bigint primary key auto_increment,
 region bigint,
 country bigint,
 uf_code varchar(100) unique,
 name varchar(100),
 uf varchar(100)
);

create table city(
 id_city bigint primary key auto_increment,
 state bigint,
 ibge_code varchar(100),
 name varchar(100)
);

create table destinations(
 id_destinations bigint primary key auto_increment,
 city bigint,
 reference varchar(100),
 image_link varchar(300),
 image mediumblob
);

create table traveler(
 id_traveler bigint primary key auto_increment,
 name varchar(100),
 phone varchar(13),
 email varchar(100) unique,
 image_link varchar(300),
 image mediumblob
);

create table news(
 id_news bigint primary key auto_increment,
 traveler bigint,
 destinations bigint,
 title varchar(100),
 subtitle varchar(100),
 text varchar(300),
 date_time datetime,
 image_link varchar(300),
 image mediumblob
);

create table comments(
 id_comments bigint primary key auto_increment,
 traveler bigint,
 news bigint,
 text varchar(300),
 date_time datetime
);

create table events(
 id_events bigint primary key auto_increment,
 destinations bigint,
 start_date datetime,
 end_date datetime,
 description varchar(200)
);

alter table state add constraint fk_state_region foreign key (region) references region(id_region);
alter table state add constraint fk_state_country foreign key (country) references country(id_country);
alter table city add constraint fk_city_state foreign key (state) references state(id_state);
alter table destinations add constraint fk_destinations_city foreign key (city) references city(id_city);
alter table news add constraint fk_news_traveler foreign key (traveler) references traveler(id_traveler);
alter table news add constraint fk_news_destinations foreign key (destinations) references destinations(id_destinations);
alter table comments add constraint fk_comments_traveler foreign key (traveler) references traveler(id_traveler);
alter table comments add constraint fk_comments_news foreign key (news) references news(id_news);
alter table events add constraint fk_events_destinations foreign key (events) references events(id_events);