TYPE=VIEW
query=select `sakila`.`customer`.`customer_id` AS `customer_id`,`sakila`.`customer`.`first_name` AS `first_name`,`sakila`.`customer`.`last_name` AS `last_name`,`sakila`.`customer`.`active` AS `active` from `sakila`.`customer`
md5=8ffe022ac793206ca80a03597a554d94
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-07-17 05:24:19
create-version=1
source=SELECT customer_id, first_name, last_name, active\nfrom customer
client_cs_name=cp850
connection_cl_name=cp850_general_ci
view_body_utf8=select `sakila`.`customer`.`customer_id` AS `customer_id`,`sakila`.`customer`.`first_name` AS `first_name`,`sakila`.`customer`.`last_name` AS `last_name`,`sakila`.`customer`.`active` AS `active` from `sakila`.`customer`