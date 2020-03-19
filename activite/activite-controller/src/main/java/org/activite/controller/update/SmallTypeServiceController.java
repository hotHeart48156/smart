package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class SmallTypeServiceController{
    @Autowired
private SmallTypeServiceService service;
@ApiOperation("updateSmallTypeService)
@PostMapping("/update/SmallTypeService/")
public  void  update(SmallTypeServiceDto  dto){
service.SmallTypeService (dto) 
}
}
