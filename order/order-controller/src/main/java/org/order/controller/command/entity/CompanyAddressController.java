package org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyAddressController{
    @Autowired
private CompanyAddressService service;
@ApiOperation("updateCompanyAddress)
@PostMapping("/update/CompanyAddress/")
public  void  update(CompanyAddressDto  dto){
service.CompanyAddress (dto) 
}
}
