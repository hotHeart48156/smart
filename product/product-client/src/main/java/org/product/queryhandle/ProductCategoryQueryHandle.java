package  org.product.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class ProductCategoryQueryHandle{
    @QueryHandler
public List<ProductCategory>query(ProductCategoryQuery query){


}}
