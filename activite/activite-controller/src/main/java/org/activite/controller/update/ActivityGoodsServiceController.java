package  org.activite.controller.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
public class ActivityGoodsServiceController{
    @Autowired
private ActivityGoodsServiceService service;
@ApiOperation("updateActivityGoodsService)
@PostMapping("/update/ActivityGoodsService/")
public  void  update(ActivityGoodsServiceDto  dto){
service.ActivityGoodsService (dto) 
}
}
