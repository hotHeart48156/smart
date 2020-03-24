package  org.activite.controller.update;
@RestController(value="/update")public class RecommendSubjectServiceController{
    @Autowired
private RecommendSubjectServiceService service;
@ApiOperation("updateRecommendSubjectService)
@PostMapping(value=" entityFile ")
public  void  update(RecommendSubjectServiceDto  dto){
service.RecommendSubjectService (dto) 
}
}
