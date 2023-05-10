CREATE DATABASE Question4;

USE Question4;

CREATE TABLE Address(
	address_id SERIAL PRIMARY KEY,
	zip VARCHAR(50),
	street VARCHAR(250),
	complement VARCHAR(250),
	neighborhood VARCHAR(100),
	city VARCHAR(100),
	state VARCHAR(100),
	country VARCHAR(50) 
);

CREATE table Person(
	person_id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	age INT,
	phone VARCHAR(20),
	height INT,
	email VARCHAR(250) UNIQUE,
	cpf VARCHAR(14) UNIQUE,
	birthday DATE,
	address_id INTEGER,
	CONSTRAINT address_id  FOREIGN KEY(address_id) REFERENCES Address (address_id)
);


