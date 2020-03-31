package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.PlatformDto;
import org.activite.service.command.coupon.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class PlatformController{
    @Autowired
private PlatformService service;
@PostMapping(value=" entityFile ")
public  void  update(PlatformDto dto){
service.Platform (dto); 
}
}
