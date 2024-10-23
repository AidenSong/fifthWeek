
CREATE TABLE IF NOT EXISTS MEMBER_INFO (
    MEMBER_ID BIGINT PRIMARY KEY,
    MEMBER_BALANCE INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS MEMBER_HISTORY (
    MEMBER_ID BIGINT,
    INDE_AMOUNT INTEGER,
    TOTAL_BALANCE INTEGER,
    CREATED_AT TIMESTAMP,

    CONSTRAINT FK_MEMBER_INFO_MEMBER_HISTORY
        FOREIGN KEY (MEMBER_ID)
        REFERENCES MEMBER_INFO (MEMBER_ID)
);

CREATE TABLE IF NOT EXISTS PRODUCT_INFO (
    PRODUCT_ID BIGINT PRIMARY KEY,
    PRODUCT_NAME VARCHAR
);

CREATE TABLE IF NOT EXISTS PRODUCT_OPTION_INFO (
    PRODUCT_ID BIGINT,
    PRODUCT_OPTION_ID BIGINT NOT NULL,
    PRODUCT_OPTION_NAME VARCHAR NOT NULL,
    PRODUCT_QUANTITY INTEGER NOT NULL,

    CONSTRAINT FK_PRODUCT_INFO_PRODUCT_OPTION_INFO
        FOREIGN KEY (PRODUCT_ID)
        REFERENCES PRODUCT_INFO (PRODUCT_ID)
);

CREATE TABLE IF NOT EXISTS PRODUCT_HISTORY (
    PRODUCT_ID BIGINT,
    INDE_AMOUNT INTEGER NOT NULL,
    INDE_QUANTITY INTEGER NOT NULL,
    CREATE_AT TIMESTAMP NOT NULL,

    CONSTRAINT FK_PRODUCT_INFO_PRODUCT_HISTORY
        FOREIGN KEY (PRODUCT_ID)
        REFERENCES PRODUCT_INFO (PRODUCT_ID)
);

CREATE TABLE IF NOT EXISTS ORDER_INFO (
    ORDER_ID BIGINT PRIMARY KEY,
    MEMBER_ID BIGINT,
    PRODUCT_LIST VARCHAR,
    PRODUCT_OPTION_LIST VARCHAR,
    QUANTITY_LIST VARCHAR,

    CONSTRAINT FK_MEMBER_INFO_ORDER_INFO
        FOREIGN KEY (MEMBER_ID)
        REFERENCES MEMBER_INFO (MEMBER_ID)
);

CREATE TABLE IF NOT EXISTS ORDER_HISTORY (
    ORDER_ID BIGINT,
    MEMBER_ID BIGINT,
    PRODUCT_ID BIGINT,
    PRODUCT_OPTION_ID BIGINT,
    QUANTITY INTEGER,
    CREATED_AT TIMESTAMP,

    CONSTRAINT FK_ORDER_INFO_ORDER_HISTORY
        FOREIGN KEY (ORDER_ID)
        REFERENCES ORDER_INFO (ORDER_ID),
    CONSTRAINT FK_MEMBER_INFO_ORDER_HISTORY
        FOREIGN KEY (MEMBER_ID)
        REFERENCES MEMBER_INFO (MEMBER_ID),
    CONSTRAINT FK_PRODUCT_INFO_ORDER_HISTORY
        FOREIGN KEY (PRODUCT_ID)
        REFERENCES PRODUCT_INFO (PRODUCT_ID)
);

CREATE TABLE IF NOT EXISTS PAYMENT_HISTORY (
    MEMBER_ID BIGINT,
    ORDER_ID BIGINT,
    PAYMENT_AMOUNT INTEGER,

    CONSTRAINT FK_MEMBER_ID_PAYMENT_HISTORY
        FOREIGN KEY (MEMBER_ID)
        REFERENCES MEMBER_INFO (MEMBER_ID),
    CONSTRAINT FK_ORDER_INFO_PAYMENT_HISTORY
        FOREIGN KEY (ORDER_ID)
        REFERENCES ORDER_INFO (ORDER_ID)
);

CREATE TABLE IF NOT EXISTS SHOPPING_CART (
    MEMBER_ID BIGINT,
    PRODUCT_ID BIGINT,
    PRODUCT_OPTION_ID BIGINT,
    QUANTITY INTEGER NOT NULL,

    CONSTRAINT FK_MEMBER_INFO_SHOPPING_CART
        FOREIGN KEY (MEMBER_ID)
        REFERENCES MEMBER_INFO (MEMBER_ID),
    CONSTRAINT FK_PRODUCT_INFO_SHOPPING_CART
        FOREIGN KEY (PRODUCT_ID)
        REFERENCES PRODUCT_INFO (PRODUCT_ID)
);
