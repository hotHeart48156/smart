package org.users.service.queryservice;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class AppletSetQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<AppletSet>  query(AppletSetQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(AppletSet.class)).join();
}
}
