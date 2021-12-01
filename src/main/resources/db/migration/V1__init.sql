CREATE TABLE IF NOT EXISTS products (id bigserial PRIMARY KEY, title VARCHAR (255), price VARCHAR (255));

INSERT INTO products (title, price) VALUES
('Milk', '0.80 Euro'),
('Bread', '0.67 Euro'),
('Tomato', '1.22 Euro'),
('Cucumber', '1.13 Euro'),
('Butter', '1.89 Euro');