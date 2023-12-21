INSERT INTO authors (first_name, last_name)
VALUES ('Camilla', 'LACKBERG'),
       ('Victor', 'HUGO')
;

INSERT INTO clients (first_name, last_name, mail)
VALUES ('Laurent', 'GINA', 'laurentgina@mail.com'),
       ('Damien', 'GOOD', 'damiengood@mail.com'),
       ('Sophie', 'FONCEK', 'sophiefoncek@mail.com'),
       ('Agathe', 'FEELING', 'agathefeeling@mail.com');

INSERT INTO books (title, author_id, nb_pages, price)
VALUES ('Les Miserables',1, 262, 20),
       ('La petite fille',1, 540, 34);
commit;