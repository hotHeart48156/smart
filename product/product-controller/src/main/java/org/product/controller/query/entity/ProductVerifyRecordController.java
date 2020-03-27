package  org.product.controller.query.entity;

import org.product.dto.entity.ProductVerifyRecordDto;
import org.product.service.command.entity.ProductVerifyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductVerifyRecordController{
    @Autowired
private ProductVerifyRecordService service;
@PostMapping(value="ProductVerifyRecord") 
public  void  query(ProductVerifyRecordDto  dto){
service.ProductVerifyRecord (dto); 
}
}
