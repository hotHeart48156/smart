package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.domain.entity.MemberStatisticsInfo;
import org.users.executor.query.entity.MemberStatisticsInfoQuery;
import org.users.service.AbstractQueryService;

import java.util.List;

@Service
public class MemberStatisticsInfoQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<MemberStatisticsInfo>  query(MemberStatisticsInfoQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(MemberStatisticsInfo.class)).join();
}
}
