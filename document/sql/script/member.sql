CREATE TABLE "member"
(
    id serial NOT NULL,
    name varchar(50) NOT NULL,
    age  int NOT NULL,
    CONSTRAINT PK_8 PRIMARY KEY ( id )
);

INSERT INTO
    "member" (name, age)
VALUES
    ('Edward','21'),
    ('Louis','27'),
    ('Alice','32');
