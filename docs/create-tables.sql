CREATE TABLE books (
  id           VARCHAR(36)  NOT NULL,
  name         VARCHAR(100) NOT NULL,
  created_time TIMESTAMP    NOT NULL,
  updated_time TIMESTAMP DEFAULT NULL,
  PRIMARY KEY (id)
);