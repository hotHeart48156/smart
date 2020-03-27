package  org.order.controller.command;
@RestController(value="/update")
public class CartItemController{
    @Autowired
private CartItemService service;
@PostMapping(value=" entityFile ")
public  void  update(CartItemDto  dto){
service.CartItem (dto); 
}
}
