package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.domain.entity.UserIntegrationRule;
import org.users.executor.query.entity.UserIntegrationRuleQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class UserIntegrationRuleQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired

 @QueryHandler
public List<UserIntegrationRule>query(UserIntegrationRuleQuery query){


}}
