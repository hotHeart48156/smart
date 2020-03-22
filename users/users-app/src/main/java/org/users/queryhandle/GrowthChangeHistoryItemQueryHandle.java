package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.GrowthChangeHistoryItem;
import org.users.executor.query.entity.GrowthChangeHistoryItemQuery;

import java.util.List;
public class GrowthChangeHistoryItemQueryHandle{
    @QueryHandler
public List<GrowthChangeHistoryItem>query(GrowthChangeHistoryItemQuery query){


}}
