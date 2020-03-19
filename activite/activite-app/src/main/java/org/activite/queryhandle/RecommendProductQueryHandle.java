package  org.activite.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class RecommendProductQueryHandle{
    @QueryHandler
public List<RecommendProduct>query(RecommendProductQuery query){


}}
