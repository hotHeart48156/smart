package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class AddressQueryHandle{
    @QueryHandler
public List<Address>query(AddressQuery query){


}}
