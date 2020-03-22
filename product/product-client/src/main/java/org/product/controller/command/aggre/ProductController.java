package  org.product.controller.command.aggre;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ProductController{
    @Autowired
private ProductService service;
@ApiOperation("updateProduct)
@PostMapping("/update/Product/")
public  void  update(ProductDto  dto){
service.Product (dto) 
}
}
