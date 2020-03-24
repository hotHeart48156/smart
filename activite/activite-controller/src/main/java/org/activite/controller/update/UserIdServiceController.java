package  org.activite.controller.update;
@RestController(value="/update")public class UserIdServiceController{
    @Autowired
private UserIdServiceService service;
@ApiOperation("updateUserIdService)
@PostMapping(value=" entityFile ")
public  void  update(UserIdServiceDto  dto){
service.UserIdService (dto) 
}
}
