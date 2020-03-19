package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class HomeBrandServiceController{
    @Autowired
private HomeBrandServiceService service;
@ApiOperation("updateHomeBrandService)
@PostMapping("/update/HomeBrandService/")
public  void  update(HomeBrandServiceDto  dto){
service.HomeBrandService (dto) 
}
}
