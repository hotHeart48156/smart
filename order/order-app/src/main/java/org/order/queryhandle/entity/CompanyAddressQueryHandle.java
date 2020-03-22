package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class CompanyAddressQueryHandle{
    @QueryHandler
public List<CompanyAddress>query(CompanyAddressQuery query){


}}
