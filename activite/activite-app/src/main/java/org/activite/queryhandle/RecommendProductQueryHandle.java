package  org.activite.queryhandle;

import org.activite.domain.entity.RecommendProduct;
import org.activite.executor.query.entity.RecommendProductQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class RecommendProductQueryHandle{
    @QueryHandler
public List<RecommendProduct>query(RecommendProductQuery query){


}}
