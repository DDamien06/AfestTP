INSERT INTO authors (first_name, last_name)
VALUES ('Camilla', 'LACKBERG'),
       ('Victor', 'HUGO')
;

INSERT INTO clients (first_name, last_name, mail)
VALUES ('Laurent', 'GINA', 'laurentgina@mail.com'),
       ('Damien', 'GOOD', 'damiengood@mail.com'),
       ('Sophie', 'FONCEK', 'sophiefoncek@mail.com'),
       ('Agathe', 'FEELING', 'agathefeeling@mail.com');

INSERT INTO books (author, book_type, nb_pages, price)
VALUES ('HUGO', 'POESIE', 262, 20),
       ('LACKBERG', 'POLICIER', 540, 34);
