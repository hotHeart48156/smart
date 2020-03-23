package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.domain.entity.AppletSet;
import org.users.executor.query.entity.AppletSetQuery;
import org.users.service.AbstractQueryService;

import java.util.List;

@Service
public class AppletSetQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<AppletSet>  query(AppletSetQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(AppletSet.class)).join();
}
}
