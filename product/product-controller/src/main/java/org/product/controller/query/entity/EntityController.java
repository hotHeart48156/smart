package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class EntityController{
    @Autowired
private EntityService service;
@PostMapping(value="Entity") 
public  void  query(EntityDto  dto){
service.Entity (dto); 
}
}
