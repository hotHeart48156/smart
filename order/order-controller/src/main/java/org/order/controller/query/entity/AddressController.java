package org.order.controller.query.entity;

import org.order.dto.entitydto.AddressDto;
import org.order.service.command.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value="Address")
public  void  query(AddressDto dto){
service.Address (dto); 
}
}

