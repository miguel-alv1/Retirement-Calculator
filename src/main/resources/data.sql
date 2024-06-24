-- CREATE TABLE user (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     FirstName VARCHAR(64),
--     LastName VARCHAR(64),
--     Goals VARCHAR(255)
-- );

CREATE TABLE assets (
    id INT PRIMARY KEY,
    TotalValue INT,
    Description varchar(255)
    --userId INT FOREIGN KEY
);

CREATE TABLE debts (
    id INT PRIMARY KEY,
    TotalValue INT,
    Description varchar(255)
    --userId INT FOREIGN KEY
);

-- INSERT INTO user (id, FirstName, LastName, debts, 401kBalance, TaxableBrokerage, NonTaxableBrokerage, AlternativeAssets)
-- VALUES (1, 'Miguel', 'Alvarez', 1000, 7000, 3000, 30000, 10000);
-- INSERT INTO user (id, name) VALUES (2, 'France');
-- INSERT INTO user (id, name) VALUES (3, 'Brazil');
-- INSERT INTO user (id, name) VALUES (4, 'Italy');
-- INSERT INTO user (id, name) VALUES (5, 'Canada');