create table product(
  name    varchar(20), not null
  size    numeric(3,2), not null
  category    varchar(20), not null
  more_info   varchar(20),
  primary key (name)
); 

create table order(
  order_id    int, not null
  status    varchar(8), not null
  date_issued   date,
  card_number   int, not null
  st_name   varchar(20), not null
  st_number int, not null
  apt_number    varchar(10) 
  zipcode   numeric(5,0), not null
  primary key (order_ID),
  foreign key(card_number) to credit_card,
  foreign key(st_name) to credit_card,
  foreign key(st_number) to credit_card,
  foreign key(apt_number) to credit_card,
  foreign key(zipcode) to credit_card,
  check(status in ('issued', 'send', 'received'))
);

create table credit_card(
  card_number   int, not null
  sec_code    int, not null
  exp_date    date,
  st_name   varchar(20), not null
  st_number int, not null
  apt_number    varchar(10) 
  city    varchar(20),
  zipcode   numeric(5,0), not null
  state   char(2),
  first_name    varchar(20), not null
  mid_initial     char(1)
  last_name   varchar(20), not null
  primary key(card_number, st_number, st_name, apt_number, zipcode)
  foreign key(first_name) to customer,
  foreign key(mid_initial) to customer,
  foreign key(last_name) to customer
);

create table customer(
  balance   numeric(5,2)
  first_name    varchar(20), not null
  mid_initial     char(1)
  last_name   varchar(20), not null
  primary key(first_name, mid_initial, last_name)
);

create table address(
  st_number   int,not null
  st_name   varchar(20), not null
  apt_number    varchar(10)
  city    varchar(20),
  zipcode   numeric(5,0), not null
  state   char(2), 
  primary key(st_number, st_name, apt_number, zipcode)
);

create table staff(
  first_name    varchar(20), not null
  mid_initial     char(1)
  last_name   varchar(20), not null
  salary    numeric(6,2)
  job_title   varchar(20), not null
  st_number   int, not null
  st_name   varchar(20), not null
  apt_number    varchar(10)
  zipcode   numeric(5,0), not null
  primary key(first_name, mid_initial, last_name),
  foreign key(st_number) to address,
  foreign key(st_name) to address, 
  foreign key (apt_number) to address,
  foreign key (zipcode) to address
);

create table pricing(
  state   char(2), not null
  price   numeric(3, 2), not null
  name    varchar(20), not null
  primary key(name, state),
  foreign key(name) references product
);

create table warehouse(
  storage_capacity  numeric(6,2), not null
  st_number   int,not null
  st_name   varchar(20), not null
  apt_number    varchar(10)
  zipcode   numeric(5,0), not null
  primary key(st_number, st_name, apt_number, zipcode),
  foreign key(st_number) to address,
  foreign key(st_name) to address, 
  foreign key (apt_number) to address,
  foreign key (zipcode) to address
);

create table stock(
  quantity    int, not null
  name    varchar(20), not null
  st_number   int,not null
  st_name   varchar(20), not null
  apt_number    varchar(10)
  zipcode   numeric(5,0), not null
  primary key(name, st_number, st_name, apt_number, zipcode),
  foreign key(name) to product,
  foreign key(st_number) to address,
  foreign key(st_name) to address, 
  foreign key (apt_number) to address,
  foreign key (zipcode) to address)
);

create table customer_address(
  first_name    varchar(20), not null
  mid_initial     char(1)
  last_name   varchar(20), not null
  st_number   int,not null
  st_name   varchar(20), not null
  apt_number    varchar(10)
  zipcode   numeric(5,0), not null
  primary key(first_name, mid_initial, last_name, st_number, st_name, apt_number, zipcode),
  foreign key(first_name) to customer,
  foreign key(mid_initial) to customer, 
  foreign key(last_name) to customer,
  foreign key(st_number)to address,
  foreign key(st_name)to address,
  foreign key(apt_number)to address,
  foreign key(zipcode)to address
);





