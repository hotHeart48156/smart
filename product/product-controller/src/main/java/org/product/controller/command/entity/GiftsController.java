package  org.product.controller.command.entity;

import org.product.dto.entity.GiftsDto;
import org.product.service.command.entity.GiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class GiftsController{
    @Autowired
private GiftsService service;
@PostMapping(value=" entityFile ")
public  void  update(GiftsDto  dto){
service.Gifts (dto); 
}
}
