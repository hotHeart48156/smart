package  org.product.queryhandle.aggre;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class ProductQueryHandle{
    @QueryHandler
public List<Product>query(ProductQuery query){


}}
