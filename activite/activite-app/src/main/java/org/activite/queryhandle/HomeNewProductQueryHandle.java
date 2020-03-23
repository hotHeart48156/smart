package  org.activite.queryhandle;

import org.activite.domain.entity.HomeNewProduct;
import org.activite.executor.query.entity.HomeNewProductQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class HomeNewProductQueryHandle{
    @QueryHandler
public List<HomeNewProduct>query(HomeNewProductQuery query){


}}
