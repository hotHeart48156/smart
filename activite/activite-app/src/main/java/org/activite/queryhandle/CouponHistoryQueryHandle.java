package  org.activite.queryhandle;

import org.activite.domain.entity.CouponHistory;
import org.activite.executor.query.entity.CouponHistoryQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class CouponHistoryQueryHandle{
    @QueryHandler
public List<CouponHistory>query(CouponHistoryQuery query){


}}
