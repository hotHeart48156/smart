package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.Role;
import org.users.executor.query.entity.RoleQuery;

import java.util.List;

import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class RoleQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<Role>  query(RoleQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Role.class)).join();
}
}
