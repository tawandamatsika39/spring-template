CREATE TABLE item (
    itemId          UUID PRIMARY KEY,
    description     VARCHAR(200) NOT NULL,
    price           NUMERIC(6,3),
    quantity        INTEGER(11)
);