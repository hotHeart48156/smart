package org.users.service.queryservice;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class IntegrationConsumeSettingQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<IntegrationConsumeSetting>  query(IntegrationConsumeSettingQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(IntegrationConsumeSetting.class)).join();
}
}
