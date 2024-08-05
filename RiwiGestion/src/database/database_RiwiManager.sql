CREATE DATABASE riwiManager;

USE riwiManager;

CREATE TABLE company (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    sector VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    contact VARCHAR(255) NOT NULL
);

CREATE TABLE vacancy (
	id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    duration VARCHAR(255) NOT NULL,
    status VARCHAR(50) NOT NULL,
    companyId INT,
    FOREIGN KEY (companyId) REFERENCES company(id) ON DELETE CASCADE 
);

CREATE TABLE coder (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    document VARCHAR(255) NOT NULL UNIQUE,
    cohorte INT NOT NULL,
    cv TEXT NOT NULL
);

CREATE TABLE contract (
	id INT AUTO_INCREMENT PRIMARY KEY,
    applicationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(255) NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    vacancyId INT,
    coderId INT,
    FOREIGN KEY (vacancyId) REFERENCES vacancy(id) ON DELETE CASCADE,
    FOREIGN KEY (coderId) REFERENCES coder(id) ON DELETE CASCADE
);

ALTER TABLE vacancy ADD COLUMN technology VARCHAR(255) NOT NULL;
ALTER TABLE coder ADD COLUMN clan VARCHAR(255) NOT NULL;