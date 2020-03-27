package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value="Address") 
public  void  query(AddressDto  dto){
service.Address (dto); 
}
}
