package  org.activite.controller.update;
@RestController(value="/update")public class GroupMemberServiceController{
    @Autowired
private GroupMemberServiceService service;
@ApiOperation("updateGroupMemberService)
@PostMapping(value=" entityFile ")
public  void  update(GroupMemberServiceDto  dto){
service.GroupMemberService (dto) 
}
}
