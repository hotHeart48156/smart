package org.order.controller.query.entity;

import org.order.dto.entitydto.CompanyAddressDto;
import org.order.service.command.CompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class CompanyAddressController{
    @Autowired
private CompanyAddressService service;
@PostMapping(value="CompanyAddress")
public  void  query(CompanyAddressDto dto){
service.CompanyAddress (dto); 
}
}

