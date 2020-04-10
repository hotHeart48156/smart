package  org.product.controller.command.entity;

import org.product.dto.entity.MemberPriceDto;
import org.product.service.command.entity.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class MemberPriceController{
    @Autowired
private MemberPriceService service;
@PostMapping(value=" memberPrice")
public  void  update(MemberPriceDto  dto){
service.MemberPrice (dto); 
}
}
