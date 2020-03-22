package org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class EntityController{
    @Autowired
private EntityService service;
@ApiOperation("updateEntity)
@PostMapping("/update/Entity/")
public  void  update(EntityDto  dto){
service.Entity (dto) 
}
}
