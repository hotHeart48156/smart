package  org.product.controller.command.aggre;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class BrandController{
    @Autowired
private BrandService service;
@ApiOperation("updateBrand)
@PostMapping("/update/Brand/")
public  void  update(BrandDto  dto){
service.Brand (dto) 
}
}
