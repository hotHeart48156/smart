package  org.activite.queryhandle;

import org.activite.domain.entity.PromotionType;
import org.activite.executor.query.entity.PromotionTypeQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class PromotionTypeQueryHandle{
    @QueryHandler
public List<PromotionType>query(PromotionTypeQuery query){


}}
