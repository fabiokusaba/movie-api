CREATE TABLE IF NOT EXISTS movie(
    id NUMBER(3) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    rating NUMBER(3,1) NOT NULL
);