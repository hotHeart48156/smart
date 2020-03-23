package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.aggregation.User;
import org.users.executor.query.aggre.UserQuery;

import java.util.List;

import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class UserQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<User>  query(UserQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(User.class)).join();
}
}
