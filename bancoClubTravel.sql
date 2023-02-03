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
 uf_code varchar(100) unique,
 name varchar(100),
 uf varchar(100),
 region bigint,
 country bigint
);

create table city(
 id_city bigint primary key auto_increment,
 ibge_code varchar(100),
 name varchar(100),
 state bigint
);

create table destinations(
 id_destinations bigint primary key auto_increment,
 reference varchar(100),
 image_link varchar(300),
 image mediumblob,
 city bigint
);

create table traveler(
 id_traveler bigint primary key auto_increment,
 image_link varchar(300),
 image mediumblob,
 contact bigint,
 users bigint
);

create table contact(
 id_contact bigint primary key auto_increment,
 name varchar(100),
 phone varchar(13),
 email varchar(100) unique
);

create table users(
 id_user bigint primary key auto_increment,
 user_name varchar(100) unique,
 password varchar(10)
);

create table permission(
 id_permission bigint primary key auto_increment,
 description varchar(300)
);

create table news(
 id_news bigint primary key auto_increment,
 title varchar(100),
 text varchar(300),
 date_time datetime,
 image_link varchar(300),
 image mediumblob,
 traveler bigint,
 destinations bigint
);

create table sub_news(
 id_sub_news bigint primary key auto_increment,
 sub_title varchar(100),
 text varchar(100),
 image_link varchar(300),
 image mediumblob,
 news bigint
);

create table comments(
 id_comments bigint primary key auto_increment,
 text varchar(300),
 date_time datetime,
 traveler bigint,
 news bigint
);

create table events(
 id_events bigint primary key auto_increment,
 start_date datetime,
 end_date datetime,
 description varchar(200),
 destinations bigint
);

create table user_permission(
 id_user bigint,
 id_permission bigint,
 primary key(id_user, id_permission),
 users bigint,
 permission bigint
 );

alter table state add constraint fk_state_region foreign key (region) references region(id_region);
alter table state add constraint fk_state_country foreign key (country) references country(id_country);
alter table city add constraint fk_city_state foreign key (state) references state(id_state);
alter table destinations add constraint fk_destinations_city foreign key (city) references city(id_city);
alter table news add constraint fk_news_traveler foreign key (traveler) references traveler(id_traveler);
alter table news add constraint fk_news_destinations foreign key (destinations) references destinations(id_destinations);
alter table comments add constraint fk_comments_traveler foreign key (traveler) references traveler(id_traveler);
alter table comments add constraint fk_comments_news foreign key (news) references news(id_news);
alter table events add constraint fk_events_destinations foreign key (destinations) references destinations(id_destinations);
alter table traveler add constraint fk_traveler_contact foreign key (contact) references contact(id_contact);
alter table traveler add constraint fk_traveler_users foreign key (users) references users(id_user);
alter table user_permission add constraint fk_up_users foreign key (users) references users(id_user);
alter table user_permission add constraint fk_up_permission foreign key (permission) references permission(id_permission); 
alter table sub_news add constraint fk_sn_news foreign key (news) references news(id_news);