insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (1,'ACTIVE', '5108759925540552', 'Manolo', 'Longfellow', 'mlongfellow0@last.fm', '71870 Daystar Hill', '695-170-9550',
        '2020-10-15');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (2,'CLOSED', '3552132167013314', 'Godard', 'Ricard', 'gricard1@photobucket.com', '07520 Troy Drive', '669-401-2076',
        '2023-01-28');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (3,'ACTIVE', '3535319362404420', 'Lyn', 'Worwood', 'lworwood2@state.tx.us', '361 Hallows Terrace', '285-493-8283',
        '2023-03-30');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (4,'ACTIVE', '3553010960744013', 'Zerk', 'Teml', 'zteml3@nih.gov', '046 Little Fleur Lane', '787-641-2807',
        '2023-01-03');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (5,'ACTIVE', '633414162211272568', 'Ryley', 'Barzen', 'rbarzen4@fotki.com', '310 Longview Hill', '753-755-5703',
        '2022-11-04');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (6,'ACTIVE', '30516761492056', 'Sinclare', 'Howison', 'showison5@rambler.ru', '1 Eagle Crest Center', '128-831-0646',
        '2023-11-12');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (7,'CLOSED', '4033398025813545', 'Kristofer', 'MacCaughen', 'kmaccaughen6@so-net.ne.jp', '3752 Brentwood Point',
        '472-357-8079', '2022-09-22');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (8,'ACTIVE', '201615712912486', 'Galven', 'Tendahl', 'gtendahl7@alexa.com', '1 Paget Place', '152-826-7357',
        '2023-01-02');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (9,'ACTIVE', '561016776853444725', 'Ivor', 'Sulman', 'isulman8@imageshack.us', '8844 Summit Lane', '697-436-6686',
        '2023-06-06');
insert into clients (id,status, tax_code, first_name, last_name, email, address, phone, created_at)
values (10,'ACTIVE', '3581290505412856', 'Sal', 'Balazs', 'sbalazs9@ft.com', '06 Badeau Plaza', '724-666-7581', '2022-08-08');

insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (1,'AC2023001',1, 'CREDIT', 'ACTIVE',  6200.10, 'EUR', '2022-12-12');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (2,'ACU2023001', 1, 'CURRENT', 'ACTIVE', 100000.10, 'EUR', '2020-08-23');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (3,'AS2023001', 1, 'SALARY', 'ACTIVE', 12000.10, 'EUR', '2023-01-04');
insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (4,'AS2023002', 2, 'SALARY', 'ACTIVE', 8800.10, 'EUR', '2022-02-02');
insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (5,'ACU2023003', 3, 'CURRENT', 'ACTIVE', 40100.10, 'EUR', '2020-04-01');
insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (6,'AD2023004', 4, ' DEPOSIT', 'ACTIVE', 45000.00, 'EUR', '2021-06-06');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (7,'AC2023005', 5, ' CREDIT', 'ACTIVE', 80.00, 'EUR', '2020-06-09');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (8,'AC2023006', 6, ' CREDIT', 'CLOSED', 00.00, 'EUR', '2020-10-10');
insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (9,'AC2023007', 7, ' CREDIT', 'CLOSED', 00.00, 'EUR', '2022-12-01');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (10,'ACU2023007', 7, ' CURRENT', 'ACTIVE',1800.00, 'EUR', '2022-12-01');
insert into accounts (id,name,client_id, type, status, balance, currency_code, created_at)
values (11,'AS2023007', 7, ' SALARY', 'ACTIVE', 5000.00, 'EUR', '2022-12-01');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (12,'AS2023008', 8, ' SALARY', 'ACTIVE', 3000.00, 'EUR', '2020-11-01');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (13,'AS2023009', 9, ' SALARY', 'CLOSED', 00.00, 'EUR', '2021-11-20');
insert into accounts (id,name, client_id,type, status, balance, currency_code, created_at)
values (14,'ACU20230010', 10, ' CURRENT', 'ACTIVE', 1000.00, 'EUR', '2023-09-20');

insert into transactions (id,type,debit_account_id,credit_account_id, amount, description, created_at)
values (1,'IN_PROGRESS',1,5, 500.00, 'rent payment', '2023-09-20');
insert into transactions (id,type,debit_account_id,credit_account_id, amount, description, created_at)
values (2,'IN_PROGRESS',2,5, 500.00, 'rent payment', '2023-09-20');
insert into transactions (id,type,debit_account_id,credit_account_id, amount, description, created_at)
values (3,'COMPLETED',10,13, 1000.00, 'tuition fees', '2023-09-20');
insert into transactions (id,type,debit_account_id,credit_account_id, amount, description, created_at)
values (4,'COMPLETED',10,5, 20.00, 'tuition fees', '2023-09-20');
insert into transactions (id,type,debit_account_id,credit_account_id, amount, description, created_at)
values (5,'CANCELED',2,11, 4000.00, 'salary', '2023-09-20');

insert into managers (id,first_name, last_name, status, description, created_at)
values (1,'Sarah', 'McCurley', 'ACTIVE', 'division 1', '2021-01-01');
insert into managers (id,first_name, last_name, status, description, created_at)
values (2,'Sisile', 'Keune', 'ACTIVE', 'division 2', '2020-09-13');
insert into managers (id,first_name, last_name, status, description, created_at)
values (3,'Cyndia', 'Blamey', 'ACTIVE', 'division 1', '2022-03-02');
insert into managers (id,first_name, last_name, status, description, created_at)
values (4,'Valina', 'Kierans', 'ACTIVE', 'division 2', '2020-04-06');
insert into managers (id,first_name, last_name, status, description, created_at)
values (5,'Carlyn', 'Rajchert', 'ACTIVE', 'division 1', '2023-04-04');
insert into managers (id,first_name, last_name, status, description, created_at)
values (6,'Clem', 'Smethurst', 'ACTIVE', 'division 1', '2022-02-02');
insert into managers (id,first_name, last_name, status, description, created_at)
values (7,'Sandy', 'Oxbie', 'ACTIVE', 'division 2', '2021-08-11');
insert into managers (id,first_name, last_name, status, description, created_at)
values (8,'Terrijo', 'Durtnel', 'ACTIVE', 'division 1', '2022-06-05');

insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (1,'CREDIT', 2.00, 'ACTIVE', 10000.00,1,1, '2022-12-12');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (2,'CURRENT', 1.20, 'ACTIVE', 100000.00,2,3, '2020-08-23');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (3,'SALARY', 3.00, 'ACTIVE', 500000.00,3,3, '2023-01-04');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (4,'SALARY', 3.00, 'ACTIVE', 500000.00,4,5, '2022-02-02');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (5,'CURRENT', 1.20, 'ACTIVE', 700000.00,5,6, '2020-04-01');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (6,'DEPOSIT', 3.20, 'ACTIVE', 100000.00,6,7, '2021-06-06');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (7,'CREDIT', 2.50, 'ACTIVE', 200000.00,7,1, '2020-06-09');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (8,'CREDIT', 2.70, 'ACTIVE', 20000.00,8,1, '2020-10-10');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (9,'CREDIT', 2.00, 'CLOSED', 200000.00,9,8, '2022-12-01');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (10,'CURRENT', 1.00, 'ACTIVE', 70000.00,10,3, '2022-12-01');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (11,'SALARY', 3.00, 'ACTIVE', 400000.00,11,8, '2022-12-01');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (12,'SALARY', 3.00, 'ACTIVE', 800000.00,12,4, '2021-11-20');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (13,'SALARY', 3.00, 'CLOSED', 300000.00,13,7, '2021-11-10');
insert into agreements (id,product_type, interest_rate, status, totalsum,account_id,manager_id, created_at)
values (14,'CURRENT', 1.00, 'ACTIVE', 500000.00,14,8, '2023-09-20');





