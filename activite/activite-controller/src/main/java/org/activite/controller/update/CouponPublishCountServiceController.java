package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponPublishCountServiceController{
    @Autowired
private CouponPublishCountServiceService service;
@ApiOperation("updateCouponPublishCountService)
@PostMapping("/update/CouponPublishCountService/")
public  void  update(CouponPublishCountServiceDto  dto){
service.CouponPublishCountService (dto) 
}
}
