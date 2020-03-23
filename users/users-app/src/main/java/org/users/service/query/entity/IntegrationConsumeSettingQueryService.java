package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.executor.query.entity.IntegrationConsumeSettingQuery;

import java.util.List;

import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class IntegrationConsumeSettingQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<IntegrationConsumeSetting>  query(IntegrationConsumeSettingQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(IntegrationConsumeSetting.class)).join();
}
}
