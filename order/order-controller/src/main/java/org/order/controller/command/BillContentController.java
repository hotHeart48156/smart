package  org.order.controller.command;
@RestController(value="/update")
public class BillContentController{
    @Autowired
private BillContentService service;
@PostMapping(value=" entityFile ")
public  void  update(BillContentDto  dto){
service.BillContent (dto); 
}
}
