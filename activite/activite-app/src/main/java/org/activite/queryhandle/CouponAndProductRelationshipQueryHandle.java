package  org.activite.queryhandle;

import org.activite.domain.entity.CouponAndProductRelationship;
import org.activite.executor.query.entity.CouponAndProductRelationshipQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class CouponAndProductRelationshipQueryHandle{
    @QueryHandler
public List<CouponAndProductRelationship>query(CouponAndProductRelationshipQuery query){


}}
