package  org.activite.controller.update;
@RestController(value="/update")public class UserLevelServiceController{
    @Autowired
private UserLevelServiceService service;
@ApiOperation("updateUserLevelService)
@PostMapping(value=" entityFile ")
public  void  update(UserLevelServiceDto  dto){
service.UserLevelService (dto) 
}
}
