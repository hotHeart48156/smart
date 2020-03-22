package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MemberPriceController{
    @Autowired
private MemberPriceService service;
@ApiOperation("updateMemberPrice)
@PostMapping("/update/MemberPrice/")
public  void  update(MemberPriceDto  dto){
service.MemberPrice (dto) 
}
}
