package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class GiftsController{
    @Autowired
private GiftsService service;
@ApiOperation("updateGifts)
@PostMapping("/update/Gifts/")
public  void  update(GiftsDto  dto){
service.Gifts (dto) 
}
}
