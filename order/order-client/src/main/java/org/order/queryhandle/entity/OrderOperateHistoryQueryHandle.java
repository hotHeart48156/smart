package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderOperateHistoryQueryHandle{
    @QueryHandler
public List<OrderOperateHistory>query(OrderOperateHistoryQuery query){


}}
