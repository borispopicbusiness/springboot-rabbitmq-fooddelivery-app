CREATE TABLE menu_entity (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(255) not null,
    price decimal(10, 2) not null
);