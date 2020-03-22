package  org.order.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderQueryHandle{
    @QueryHandler
public List<Order>query(OrderQuery query){


}}
