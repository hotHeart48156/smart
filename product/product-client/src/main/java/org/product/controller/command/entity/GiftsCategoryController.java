package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GiftsCategoryController{
    @Autowired
private GiftsCategoryService service;
@ApiOperation("updateGiftsCategory)
@PostMapping("/update/GiftsCategory/")
public  void  update(GiftsCategoryDto  dto){
service.GiftsCategory (dto) 
}
}
