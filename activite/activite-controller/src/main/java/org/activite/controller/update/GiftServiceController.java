package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GiftServiceController{
    @Autowired
private GiftServiceService service;
@ApiOperation("updateGiftService)
@PostMapping("/update/GiftService/")
public  void  update(GiftServiceDto  dto){
service.GiftService (dto) 
}
}
