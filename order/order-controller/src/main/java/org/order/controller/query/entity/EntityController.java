package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class EntityController{
    @Autowired
private EntityService service;
@PostMapping(value="Entity") 
public  void  query(EntityDto  dto){
service.Entity (dto); 
}
}
