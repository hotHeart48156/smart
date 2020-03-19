package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponHistoryServiceController{
    @Autowired
private CouponHistoryServiceService service;
@ApiOperation("updateCouponHistoryService)
@PostMapping("/update/CouponHistoryService/")
public  void  update(CouponHistoryServiceDto  dto){
service.CouponHistoryService (dto) 
}
}
