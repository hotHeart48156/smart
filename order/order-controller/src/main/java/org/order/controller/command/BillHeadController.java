package  org.order.controller.command;
@RestController(value="/update")
public class BillHeadController{
    @Autowired
private BillHeadService service;
@PostMapping(value=" entityFile ")
public  void  update(BillHeadDto  dto){
service.BillHead (dto); 
}
}
