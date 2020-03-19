package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RecommendSubjectServiceController{
    @Autowired
private RecommendSubjectServiceService service;
@ApiOperation("updateRecommendSubjectService)
@PostMapping("/update/RecommendSubjectService/")
public  void  update(RecommendSubjectServiceDto  dto){
service.RecommendSubjectService (dto) 
}
}
