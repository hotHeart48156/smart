package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ProductAndCategoryRelationshipController{
    @Autowired
private ProductAndCategoryRelationshipService service;
@ApiOperation("updateProductAndCategoryRelationship)
@PostMapping("/update/ProductAndCategoryRelationship/")
public  void  update(ProductAndCategoryRelationshipDto  dto){
service.ProductAndCategoryRelationship (dto) 
}
}
