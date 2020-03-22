package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class EntityFactoryController{
    @Autowired
private EntityFactoryService service;
@ApiOperation("updateEntityFactory)
@PostMapping("/update/EntityFactory/")
public  void  update(EntityFactoryDto  dto){
service.EntityFactory (dto) 
}
}
