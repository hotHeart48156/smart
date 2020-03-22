package  org.product.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class ProductOperateLogQueryHandle{
    @QueryHandler
public List<ProductOperateLog>query(ProductOperateLogQuery query){


}}
