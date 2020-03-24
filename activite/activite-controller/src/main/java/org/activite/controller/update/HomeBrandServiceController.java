package  org.activite.controller.update;
@RestController(value="/update")public class HomeBrandServiceController{
    @Autowired
private HomeBrandServiceService service;
@ApiOperation("updateHomeBrandService)
@PostMapping(value=" entityFile ")
public  void  update(HomeBrandServiceDto  dto){
service.HomeBrandService (dto) 
}
}
