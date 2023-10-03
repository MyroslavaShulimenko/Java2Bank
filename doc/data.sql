-- CREATE TABLE accounts
-- (
--     id            int          NOT NULL GENERATED ALWAYS AS IDENTITY,
-- --     client_id   int,
--     name          varchar(120) NOT NULL,
--     type          int,
--     status        int,
--     balance       decimal,
--     currency_code integer,
--     created_at    varchar(255) NOT NULL
-- );
insert into accounts (name, type, status, balance, currency_code, created_at)
values ('Mulcahy', 1, 1, 6200.10, 0, '2022-12-12');
insert into accounts (name, type, status, balance, currency_code, created_at)
values ('Swansborough', 2, 0, 6100.10, 1, '2022-10-12');
insert into accounts (name, type, status, balance, currency_code, created_at)
values ('Blewett', 0, 1, 6100.10, 0, '2022-12-12');
insert into accounts (name, type, status, balance, currency_code, created_at)
values ('Full', 1, 1, 830.00, 2, '2022-04-12');
insert into accounts (name, type, status, balance, currency_code, created_at)
values ('Ouldcott', 3, 0, 52000.0, 1, '2022-06-07');
-- insert into accounts (name, type, status, balance, currency_code, created_at)
-- values ('Hildrew', 1, 1, 18236.0, 1, '2022-10-10');
-- insert into accounts (name, type, status, balance, currency_code, created_at)
-- values ('Capner', 2, 2, 90000.0, 1, '2022-09-19');
-- insert into accounts (name, type, status, balance, currency_code, created_at)
-- values ('Iglesia', 2, 1, 3100.0, 2, '2022-08-08');
-- insert into accounts (name, type, status, balance, currency_code, created_at)
-- values ('Pley', 2, 2, 290.0, 3, '2022-03-03');
-- insert into accounts (name, type, status, balance, currency_code, created_at)
-- values ('Farndon', 2, 4, 39123.0, 1, '2022-02-05');

-- CREATE TABLE managers
-- (
--     id          bigint       NOT NULL GENERATED ALWAYS AS IDENTITY,
--     first_name  varchar(255) NOT NULL,
--     last_name   varchar(255) NOT NULL,
--     status      int,
--     description varchar(255) NOT NULL,
--     created_at  varchar(255) NOT NULL
-- );


insert into managers (first_name, last_name, status, description, created_at)
values ('Sarah', 'McCurley', 1, 'architect cross-platform content', '2021-01-01');
insert into managers (first_name, last_name, status, description, created_at)
values ('Sisile', 'Keune', 1, 'utilize synergistic architectures', '2020-09-13');
insert into managers (first_name, last_name, status, description, created_at)
values ('Cyndia', 'Blamey', 2, 'harness turn-key applications', '2022-03-02');
insert into managers (first_name, last_name, status, description, created_at)
values ('Valina', 'Kierans', 1, 'orchestrate interactive architectures', '2020-04-06');
insert into managers (first_name, last_name, status, description, created_at)
values ('Carlyn', 'Rajchert', 2, 'innovate cross-platform e-markets', '2023-04-04');
insert into managers (first_name, last_name, status, description, created_at)
values ('Clem', 'Smethurst', 2, 'architect impactful solutions', '2022-02-02');
insert into managers (first_name, last_name, status, description, created_at)
values ('Sandy', 'Oxbie', 1, 'disintermediate strategic mindshare', '2021-08-11');
insert into managers (first_name, last_name, status, description, created_at)
values ('Terrijo', 'Durtnel', 2, 'drive mission-critical communities', '2022-06-05');
insert into managers (first_name, last_name, status, description, created_at)
values ('Fons', 'Licquorish', 1, 'matrix holistic channels', '2023-08-08');
insert into managers (first_name, last_name, status, description, created_at)
values ('Phillida', 'Andrivot', 1, 'redefine wireless platforms', '2020-12-11');

insert into agreements (product_type, interest_rate, status, sum, created_at)
values (1, 450.00, 0, 4500.00, '2023-04-07');
insert into agreements(product_type, interest_rate, status, sum, created_at)
                values (1, 253.00, 1, 22000.00,'2023-10-08');


-- CREATE TABLE clients
-- (
--     id         int          NOT NULL GENERATED ALWAYS AS IDENTITY,
-- --     client_id   int,
--     status     int,
--     tax_code   varchar(100) NOT NULL,
--     first_name varchar(100) NOT NULL,
--     last_name  varchar(100) NOT NULL,
--     email      varchar(100) NOT NULL,
--     address    varchar(150) NOT NULL,
--     phone      varchar(20)  NOT NULL,
--     created_at varchar(255) NOT NULL
-- );

insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '5108759925540552', 'Manolo', 'Longfellow', 'mlongfellow0@last.fm', '71870 Daystar Hill', '695-170-9550',
        '2020-10-15');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (0, '3552132167013314', 'Godard', 'Ricard', 'gricard1@photobucket.com', '07520 Troy Drive', '669-401-2076',
        '2023-01-28');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '3535319362404420', 'Lyn', 'Worwood', 'lworwood2@state.tx.us', '361 Hallows Terrace', '285-493-8283',
        '2023-03-30');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '3553010960744013', 'Zerk', 'Teml', 'zteml3@nih.gov', '046 Little Fleur Lane', '787-641-2807',
        '2023-01-03');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '633414162211272568', 'Ryley', 'Barzen', 'rbarzen4@fotki.com', '310 Longview Hill', '753-755-5703',
        '2022-11-04');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '30516761492056', 'Sinclare', 'Howison', 'showison5@rambler.ru', '1 Eagle Crest Center', '128-831-0646',
        '2023-11-12');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (0, '4033398025813545', 'Kristofer', 'MacCaughen', 'kmaccaughen6@so-net.ne.jp', '3752 Brentwood Point',
        '472-357-8079', '2022-09-22');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '201615712912486', 'Galven', 'Tendahl', 'gtendahl7@alexa.com', '1 Paget Place', '152-826-7357',
        '2023-01-02');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '561016776853444725', 'Ivor', 'Sulman', 'isulman8@imageshack.us', '8844 Summit Lane', '697-436-6686',
        '2023-06-06');
insert into clients (status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1, '3581290505412856', 'Sal', 'Balazs', 'sbalazs9@ft.com', '06 Badeau Plaza', '724-666-7581', '2022-08-08');


insert into transactions (type, amount, description, created_at)
values (1, 45.00, 'hhhhhhhhh', '2020-10-11');
insert into transactions (type, amount, description, created_at)
values (1, 4500.00, 'salary', '2023-09-20');
insert into transactions (type, amount, description, created_at)
values (1, 100.00, 'current', '2023-09-18');
insert into transactions (type, amount, description, created_at)
values (1, 1000.00, 'salary', '2023-09-21');
insert into transactions (type, amount, description, created_at)
values (1, 1000.00, 'salary', '2023-09-21');