package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.WeixinOpenIdDto;
import org.users.service.command.WeixinOpenIdService;


@RestController(value="/update")
public class WeixinOpenIdController{
    @Autowired
private WeixinOpenIdService service;
@PostMapping(value=" entityFile ")
public  void  update(WeixinOpenIdDto dto){
service.WeixinOpenId (dto); 
}
}
