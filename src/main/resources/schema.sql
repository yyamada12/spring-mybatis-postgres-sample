DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id    bigserial PRIMARY KEY,
    name  VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
