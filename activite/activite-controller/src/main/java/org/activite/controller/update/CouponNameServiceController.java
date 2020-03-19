package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponNameServiceController{
    @Autowired
private CouponNameServiceService service;
@ApiOperation("updateCouponNameService)
@PostMapping("/update/CouponNameService/")
public  void  update(CouponNameServiceDto  dto){
service.CouponNameService (dto) 
}
}
