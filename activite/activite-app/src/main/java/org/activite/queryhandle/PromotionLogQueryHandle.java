package  org.activite.queryhandle;

import org.activite.domain.entity.PromotionLog;
import org.activite.executor.query.entity.PromotionLogQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class PromotionLogQueryHandle{
    @QueryHandler
public List<PromotionLog>query(PromotionLogQuery query){


}}
