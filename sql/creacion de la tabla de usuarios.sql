
drop table user;
create table user(
user_id integer not null auto_increment,
username varchar(20),contraseña varchar(20),user_role_id varchar(5) not null,
name varchar(100),city_id integer not null, address varchar(250), zip_code integer,
phone varchar(20), email varchar(100), enabled integer,
primary key (user_id),
index idx_user_user_role_id(user_role_id),
constraint fk_user_user_role
foreign key(user_role_id)
references user_role(user_role_id)
on delete restrict
on update cascade,
constraint fk_user_city
foreign key(city_id)
references city(city_id)
on delete restrict
on update cascade
);
alter table user
change column contraseña pass varchar(20);

alter table user 
add nacionalidad varchar(20) after address;



