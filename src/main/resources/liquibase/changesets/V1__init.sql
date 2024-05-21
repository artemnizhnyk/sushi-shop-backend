CREATE TABLE IF NOT EXISTS items
(
    id             BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY ,
    uuid           VARCHAR(255),
    name           VARCHAR(255)                        NOT NULL UNIQUE,
    description    VARCHAR(255),
    item_type      VARCHAR(255)                        NOT NULL,
    quantity       INTEGER                             NOT NULL,
    priority       INTEGER,
    "actual-price" FLOAT                               NOT NULL,
    "old-price"    FLOAT,
    is_on_sale     BOOLEAN                             NOT NULL,
    image_url      VARCHAR(255)
);