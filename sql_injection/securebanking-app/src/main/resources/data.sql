CREATE TABLE IF NOT EXISTS usertable (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO usertable (name, email) VALUES ('Alice', 'alice@example.com');
INSERT INTO usertable (name, email) VALUES ('Bob', 'bob@example.com');
INSERT INTO usertable (name, email) VALUES ('Charlie', 'charlie@example.com');
