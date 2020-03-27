package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.GiftsCategory;
import org.product.executor.query.entity.GiftsCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class GiftsCategoryQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<GiftsCategory>  query(GiftsCategoryQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(GiftsCategory.class)).join();
}
}
