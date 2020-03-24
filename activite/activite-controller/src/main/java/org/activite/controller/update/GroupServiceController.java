package  org.activite.controller.update;
@RestController(value="/update")public class GroupServiceController{
    @Autowired
private GroupServiceService service;
@ApiOperation("updateGroupService)
@PostMapping(value=" entityFile ")
public  void  update(GroupServiceDto  dto){
service.GroupService (dto) 
}
}
