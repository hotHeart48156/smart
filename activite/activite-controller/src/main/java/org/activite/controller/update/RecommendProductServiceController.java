package  org.activite.controller.update;
@RestController(value="/update")public class RecommendProductServiceController{
    @Autowired
private RecommendProductServiceService service;
@ApiOperation("updateRecommendProductService)
@PostMapping(value=" entityFile ")
public  void  update(RecommendProductServiceDto  dto){
service.RecommendProductService (dto) 
}
}
