package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class CartItemQueryHandle{
    @QueryHandler
public List<CartItem>query(CartItemQuery query){


}}
