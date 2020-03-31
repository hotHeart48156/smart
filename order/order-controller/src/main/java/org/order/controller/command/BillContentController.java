package  org.order.controller.command;

import org.order.dto.aggredto.BillContentDto;
import org.order.service.command.BillContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class BillContentController{
    @Autowired
private BillContentService service;
@PostMapping(value=" entityFile ")
public  void  update(BillContentDto dto){
service.BillContent (dto); 
}
}

