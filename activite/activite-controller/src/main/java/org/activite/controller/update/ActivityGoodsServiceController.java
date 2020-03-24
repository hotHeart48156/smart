package  org.activite.controller.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")public class ActivityGoodsServiceController{
    @Autowired
private ActivityGoodsServiceService service;
@ApiOperation("updateActivityGoodsService)
@PostMapping(value=" entityFile ")
public  void  update(ActivityGoodsServiceDto  dto){
service.ActivityGoodsService (dto) 
}
}
