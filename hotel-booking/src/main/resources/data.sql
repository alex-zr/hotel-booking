drop table rooms if exists;
drop table users if exists;
drop table options if exists;
drop table bookings if exists;

create table rooms
(
   id integer not null,
   category varchar(255) not null,
   number integer not null,
   price double not null,
   primary key(id)
);
create table users
(
   id integer not null,
--    category varchar(255) not null,
--    number integer not null,
--    price double not null,
   primary key(id)
);
create table options
(
   id integer not null,
--    category varchar(255) not null,
--    number integer not null,
--    price double not null,
   primary key(id)
);
create table bookings
(
   id integer not null,
--    category varchar(255) not null,
--    number integer not null,
--    price double not null,
   primary key(id)
);
INSERT INTO rooms (id, category, number, price) VALUES (1, 'econom', 12, 0.0);
INSERT INTO rooms (id, category, number, price) VALUES (2, 'lux', 12, 0.0);