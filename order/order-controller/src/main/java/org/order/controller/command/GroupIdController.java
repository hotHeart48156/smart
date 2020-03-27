package  org.order.controller.command;
@RestController(value="/update")
public class GroupIdController{
    @Autowired
private GroupIdService service;
@PostMapping(value=" entityFile ")
public  void  update(GroupIdDto  dto){
service.GroupId (dto); 
}
}
