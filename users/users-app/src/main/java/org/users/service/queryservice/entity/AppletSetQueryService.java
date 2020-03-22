package org.users.service.queryservice;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.AppletSet;
import org.users.executor.query.AppletSetQuery;

import java.util.List;

public class AppletSetQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<AppletSet>  query(AppletSetQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(AppletSet.class)).join();
}
}
