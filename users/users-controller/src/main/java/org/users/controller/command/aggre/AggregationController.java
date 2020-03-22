package  org.users.controller.command.aggre;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class AggregationController{
    @Autowired
private AggregationService service;
@ApiOperation("updateAggregation)
@PostMapping("/update/Aggregation/")
public  void  update(AggregationDto  dto){
service.Aggregation (dto) 
}
}
