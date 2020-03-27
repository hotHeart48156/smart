package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class ProductAttributesController{
    @Autowired
private ProductAttributesService service;
@PostMapping(value=" entityFile ")
public  void  update(ProductAttributesDto  dto){
service.ProductAttributes (dto); 
}
}
