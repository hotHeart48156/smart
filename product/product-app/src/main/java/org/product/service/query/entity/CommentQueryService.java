package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.Comment;
import org.product.executor.query.entity.CommentQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CommentQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Comment>  query(CommentQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Comment.class)).join();
}
}
