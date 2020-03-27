package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class AbstractController{
    @Autowired
private AbstractService service;
@PostMapping(value="Abstract") 
public  void  query(AbstractDto  dto){
service.Abstract (dto); 
}
}
