package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GiftAndProductRelationshipController{
    @Autowired
private GiftAndProductRelationshipService service;
@ApiOperation("updateGiftAndProductRelationship)
@PostMapping("/update/GiftAndProductRelationship/")
public  void  update(GiftAndProductRelationshipDto  dto){
service.GiftAndProductRelationship (dto) 
}
}
