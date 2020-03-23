package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.UserCollect;
import org.users.executor.query.entity.UserCollectQuery;

import java.util.List;

import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class UserCollectQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<UserCollect>  query(UserCollectQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserCollect.class)).join();
}
}
