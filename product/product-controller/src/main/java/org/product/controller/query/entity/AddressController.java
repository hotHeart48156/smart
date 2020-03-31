package org.product.controller.query.entity;

import org.product.dto.entity.AddressDto;
import org.product.service.command.entity.AddressService;
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
