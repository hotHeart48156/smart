package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ProductConsultController{
    @Autowired
private ProductConsultService service;
@ApiOperation("updateProductConsult)
@PostMapping("/update/ProductConsult/")
public  void  update(ProductConsultDto  dto){
service.ProductConsult (dto) 
}
}