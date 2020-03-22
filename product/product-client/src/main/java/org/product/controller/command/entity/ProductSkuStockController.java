package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ProductSkuStockController{
    @Autowired
private ProductSkuStockService service;
@ApiOperation("updateProductSkuStock)
@PostMapping("/update/ProductSkuStock/")
public  void  update(ProductSkuStockDto  dto){
service.ProductSkuStock (dto) 
}
}
