CREATE TABLE product (
  p_name      VARCHAR(20),
  "size"    NUMERIC(3, 2) NOT NULL,
  category  VARCHAR(20)   NOT NULL,
  more_info VARCHAR(20),
  PRIMARY KEY (p_name)
);

CREATE TABLE customer (
  balance     NUMERIC(5, 2),
  first_name  VARCHAR(20) NOT NULL,
  mid_initial CHAR(1),
  last_name   VARCHAR(20) NOT NULL,
  PRIMARY KEY (first_name, mid_initial, last_name)
);

CREATE TABLE address (
  st_number  INT           NOT NULL,
  st_name    VARCHAR(20)   NOT NULL,
  apt_number VARCHAR(10),
  city       VARCHAR(20),
  state      CHAR(2),
  zipcode    NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (st_number, st_name, apt_number, zipcode)
);

CREATE TABLE credit_card (
  card_number CHAR(16)           NOT NULL,
  sec_code    INT           NOT NULL,
  exp_date    DATE,
  st_name     VARCHAR(20)   NOT NULL,
  st_number   INT           NOT NULL,
  apt_number  VARCHAR(10),
  city        VARCHAR(20),
  zipcode     NUMERIC(5, 0) NOT NULL,
  state       CHAR(2),
  first_name  VARCHAR(20)   NOT NULL,
  mid_initial CHAR(1),
  last_name   VARCHAR(20)   NOT NULL,
  PRIMARY KEY (card_number, st_number, st_name, apt_number, zipcode),
  FOREIGN KEY (first_name, mid_initial, last_name) REFERENCES customer
);

CREATE TABLE "order" (
  order_id    INT           NOT NULL,
  status      VARCHAR(16)    NOT NULL,
  date_issued DATE,
  card_number char(16)   NOT NULL,
  st_name     VARCHAR(20)   NOT NULL,
  st_number   INT           NOT NULL,
  apt_number  VARCHAR(10),
  zipcode     NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (order_id),
  FOREIGN KEY (card_number, st_number, st_name, apt_number, zipcode) REFERENCES credit_card,
  CHECK (status IN ('issued', 'send', 'received'))
);

CREATE TABLE staff (
  first_name  VARCHAR(20)   NOT NULL,
  mid_initial CHAR(1),
  last_name   VARCHAR(20)   NOT NULL,
  salary      NUMERIC(6, 2),
  job_title   VARCHAR(20)   NOT NULL,
  st_number   INT           NOT NULL,
  st_name     VARCHAR(20)   NOT NULL,
  apt_number  VARCHAR(10),
  zipcode     NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (first_name, mid_initial, last_name),
  FOREIGN KEY (st_number, st_name, apt_number, zipcode) REFERENCES address
);

CREATE TABLE pricing (
  state CHAR(2)       NOT NULL,
  price NUMERIC(3, 2) NOT NULL,
  p_name  VARCHAR(20)   NOT NULL,
  PRIMARY KEY (p_name, state),
  FOREIGN KEY (p_name) REFERENCES product
);

CREATE TABLE warehouse (
  storage_capacity NUMERIC(6, 2) NOT NULL,
  st_number        INT           NOT NULL,
  st_name          VARCHAR(20)   NOT NULL,
  apt_number       VARCHAR(10),
  zipcode          NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (st_number, st_name, apt_number, zipcode),
  FOREIGN KEY (st_number, st_name, apt_number, zipcode) REFERENCES address
);

CREATE TABLE stock (
  quantity   INT           NOT NULL,
  p_name      VARCHAR(20)   NOT NULL,
  st_number  INT           NOT NULL,
  st_name    VARCHAR(20)   NOT NULL,
  apt_number VARCHAR(10),
  zipcode    NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (p_name, st_number, st_name, apt_number, zipcode),
  FOREIGN KEY (p_name) REFERENCES product,
  FOREIGN KEY (st_number, st_name, apt_number, zipcode) REFERENCES address
);

CREATE TABLE customer_address (
  first_name  VARCHAR(20)   NOT NULL,
  mid_initial CHAR(1),
  last_name   VARCHAR(20)   NOT NULL,
  st_number   INT           NOT NULL,
  st_name     VARCHAR(20)   NOT NULL,
  apt_number  VARCHAR(10),
  zipcode     NUMERIC(5, 0) NOT NULL,
  PRIMARY KEY (first_name, mid_initial, last_name, st_number, st_name, apt_number, zipcode),
  FOREIGN KEY (first_name, mid_initial, last_name) REFERENCES customer,
  FOREIGN KEY (st_number, st_name, apt_number, zipcode) REFERENCES address
);








