package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.UserAndGrowChangeHistoryRelationship;
import org.users.executor.query.entity.UserAndGrowChangeHistoryRelationshipQuery;

import java.util.List;

public class UserAndGrowChangeHistoryRelationshipQueryHandle{
    @QueryHandler
public List<UserAndGrowChangeHistoryRelationship>query(UserAndGrowChangeHistoryRelationshipQuery query){


}}
