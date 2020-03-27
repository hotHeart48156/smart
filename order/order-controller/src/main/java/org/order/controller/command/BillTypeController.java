package  org.order.controller.command;
@RestController(value="/update")
public class BillTypeController{
    @Autowired
private BillTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(BillTypeDto  dto){
service.BillType (dto); 
}
}
