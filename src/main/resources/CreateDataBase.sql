CREATE TABLE books
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    author    VARCHAR(250) NOT NULL,
    book_type VARCHAR(250) NOT NULL,
    nb_pages  INT          NOT NULL,
    price     FLOAT        NOT NULL,
    available BOOLEAN DEFAULT TRUE

);

CREATE TABLE clients
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name  VARCHAR(250) NOT NULL,
    mail       VARCHAR(250) NOT NULL
);


CREATE TABLE authors
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name  VARCHAR(250) NOT NULL
);
