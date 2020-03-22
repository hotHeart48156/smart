package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.MemberStatisticsInfo;
import org.users.executor.query.entity.MemberStatisticsInfoQuery;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class MemberStatisticsInfoQueryService{
@Autowired
private QueryGateway queryGateway;
public List<MemberStatisticsInfo>  query(MemberStatisticsInfoQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(MemberStatisticsInfo.class)).join();
}
}
