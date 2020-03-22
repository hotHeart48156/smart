package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderAndOrderItemRelationshipQueryHandle{
    @QueryHandler
public List<OrderAndOrderItemRelationship>query(OrderAndOrderItemRelationshipQuery query){


}}
