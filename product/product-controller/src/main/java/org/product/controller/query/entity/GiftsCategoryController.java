package  org.product.controller.query.entity;

import org.product.dto.entity.GiftsCategoryDto;
import org.product.service.command.entity.GiftsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class GiftsCategoryController{
    @Autowired
private GiftsCategoryService service;
@PostMapping(value="GiftsCategory") 
public  void  query(GiftsCategoryDto dto){
service.GiftsCategory (dto); 
}
}
