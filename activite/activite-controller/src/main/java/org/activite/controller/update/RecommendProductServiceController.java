package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RecommendProductServiceController{
    @Autowired
private RecommendProductServiceService service;
@ApiOperation("updateRecommendProductService)
@PostMapping("/update/RecommendProductService/")
public  void  update(RecommendProductServiceDto  dto){
service.RecommendProductService (dto) 
}
}
