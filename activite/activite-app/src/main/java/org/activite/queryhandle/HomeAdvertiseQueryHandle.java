package  org.activite.queryhandle;

import org.activite.domain.entity.HomeAdvertise;
import org.activite.executor.query.entity.HomeAdvertiseQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class HomeAdvertiseQueryHandle{
    @QueryHandler
public List<HomeAdvertise>query(HomeAdvertiseQuery query){


}}
