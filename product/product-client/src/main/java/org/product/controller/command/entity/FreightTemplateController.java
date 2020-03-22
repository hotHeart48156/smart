package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class FreightTemplateController{
    @Autowired
private FreightTemplateService service;
@ApiOperation("updateFreightTemplate)
@PostMapping("/update/FreightTemplate/")
public  void  update(FreightTemplateDto  dto){
service.FreightTemplate (dto) 
}
}
