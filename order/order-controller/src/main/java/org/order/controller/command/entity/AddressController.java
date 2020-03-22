package org.order.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.order.executor.command.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressController{
    @Autowired
private AddressService service;
@ApiOperation("updateAddress)
@PostMapping("/update/Address/")
public  void  update(AddressDto  dto){
service.Address (dto) 
}
}
