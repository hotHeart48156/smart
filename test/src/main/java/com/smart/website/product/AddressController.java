package com.smart.website.product;

import org.product.dto.entity.AddressDto;
import org.product.service.command.entity.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value="/query/address")
public  void  query(AddressDto dto){
service.Address (dto); 
}
}
