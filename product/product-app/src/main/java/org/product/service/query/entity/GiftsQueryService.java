package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.Gifts;
import org.product.executor.query.entity.GiftsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class GiftsQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Gifts>  query(GiftsQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Gifts.class)).join();
}
}
