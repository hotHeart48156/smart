package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.domain.entity.Tag;
import org.users.executor.query.entity.TagQuery;
import org.users.service.AbstractQueryService;

import java.util.List;
@Service
public class TagQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<Tag>  query(TagQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Tag.class)).join();
}
}
