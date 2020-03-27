package  org.product.controller.query.entity;

import org.product.dto.entity.GiftsDto;
import org.product.service.command.entity.GiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class GiftsController{
    @Autowired
private GiftsService service;
@PostMapping(value="Gifts") 
public  void  query(GiftsDto dto){
service.Gifts (dto); 
}
}
