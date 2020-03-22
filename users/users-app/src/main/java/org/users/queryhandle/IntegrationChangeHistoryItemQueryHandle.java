package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.IntegrationChangeHistoryItem;
import org.users.executor.query.entity.IntegrationChangeHistoryItemQuery;

import java.util.List;
public class IntegrationChangeHistoryItemQueryHandle{
    @QueryHandler
public List<IntegrationChangeHistoryItem>query(IntegrationChangeHistoryItemQuery query){


}}
