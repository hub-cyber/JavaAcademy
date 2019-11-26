##
use mydb;
#seleccione todos los items de la categoria electronic(6) y despliegue la informacion de las sigientes manera 


select cat.item_id,(select description from item where item_id = cat.item_id)as description,
cat.category_id,(select description from category where category_id = cat.category_id)as 
category_description from category_item as cat where category_id =6; 

select i.item_id, i.description, c.category_id, c.description 
from category_item as cat 
inner join category as c on c.category_id= cat.category_id
inner join item as i on i.item_id = cat.item_id where  cat.category_id=6;



