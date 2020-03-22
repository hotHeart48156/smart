package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderItemQueryHandle{
    @QueryHandler
public List<OrderItem>query(OrderItemQuery query){


}}
