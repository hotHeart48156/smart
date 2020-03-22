package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.executor.query.entity.IntegrationConsumeSettingQuery;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class IntegrationConsumeSettingQueryService{
@Autowired
private QueryGateway queryGateway;
public List<IntegrationConsumeSetting>  query(IntegrationConsumeSettingQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(IntegrationConsumeSetting.class)).join();
}
}
