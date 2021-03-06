package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.MemberLevel;
import org.users.executor.query.entity.MemberLevelQuery;

import java.util.List;
import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class MemberLevelQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<MemberLevel>  query(MemberLevelQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(MemberLevel.class)).join();
}
}
