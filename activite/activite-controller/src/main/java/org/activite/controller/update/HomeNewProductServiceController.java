package  org.activite.controller.update;
@RestController(value="/update")public class HomeNewProductServiceController{
    @Autowired
private HomeNewProductServiceService service;
@ApiOperation("updateHomeNewProductService)
@PostMapping(value=" entityFile ")
public  void  update(HomeNewProductServiceDto  dto){
service.HomeNewProductService (dto) 
}
}
