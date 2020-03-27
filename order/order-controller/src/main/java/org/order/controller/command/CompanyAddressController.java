package  org.order.controller.command;
@RestController(value="/update")
public class CompanyAddressController{
    @Autowired
private CompanyAddressService service;
@PostMapping(value=" entityFile ")
public  void  update(CompanyAddressDto  dto){
service.CompanyAddress (dto); 
}
}
