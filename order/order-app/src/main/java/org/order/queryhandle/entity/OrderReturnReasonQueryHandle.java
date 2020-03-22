package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderReturnReasonQueryHandle{
    @QueryHandler
public List<OrderReturnReason>query(OrderReturnReasonQuery query){


}}
