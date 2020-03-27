package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.CommentReply;
import org.product.executor.query.entity.CommentReplyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CommentReplyQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CommentReply>  query(CommentReplyQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CommentReply.class)).join();
}
}
