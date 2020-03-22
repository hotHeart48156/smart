package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.Tag;
import org.users.executor.query.entity.TagQuery;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TagQueryService{
@Autowired
private QueryGateway queryGateway;
public List<Tag>  query(TagQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Tag.class)).join();
}
}
