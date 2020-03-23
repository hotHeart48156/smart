package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.UserIntegrationRule;
import org.users.executor.query.entity.UserIntegrationRuleQuery;

import java.util.List;

import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class UserIntegrationRuleQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<UserIntegrationRule>  query(UserIntegrationRuleQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserIntegrationRule.class)).join();
}
}
