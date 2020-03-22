package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ProductVerifyRecordController{
    @Autowired
private ProductVerifyRecordService service;
@ApiOperation("updateProductVerifyRecord)
@PostMapping("/update/ProductVerifyRecord/")
public  void  update(ProductVerifyRecordDto  dto){
service.ProductVerifyRecord (dto) 
}
}
