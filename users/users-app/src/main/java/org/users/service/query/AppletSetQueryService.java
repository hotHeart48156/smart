package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.AppletSet;
import org.users.executor.query.entity.AppletSetQuery;

import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class AppletSetQueryService{
@Autowired
private QueryGateway queryGateway;
public List<AppletSet>  query(AppletSetQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(AppletSet.class)).join();
}
}
