package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class CompanyAddressController{
    @Autowired
private CompanyAddressService service;
@PostMapping(value="CompanyAddress") 
public  void  query(CompanyAddressDto  dto){
service.CompanyAddress (dto); 
}
}
