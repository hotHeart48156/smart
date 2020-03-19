package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class HomeNewProductServiceController{
    @Autowired
private HomeNewProductServiceService service;
@ApiOperation("updateHomeNewProductService)
@PostMapping("/update/HomeNewProductService/")
public  void  update(HomeNewProductServiceDto  dto){
service.HomeNewProductService (dto) 
}
}
