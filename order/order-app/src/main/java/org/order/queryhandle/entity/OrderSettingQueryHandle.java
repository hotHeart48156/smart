package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class OrderSettingQueryHandle{
    @QueryHandler
public List<OrderSetting>query(OrderSettingQuery query){


}}
