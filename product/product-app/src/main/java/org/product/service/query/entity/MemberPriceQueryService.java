package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.MemberPrice;
import org.product.executor.query.entity.MemberPriceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class MemberPriceQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<MemberPrice>  query(MemberPriceQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(MemberPrice.class)).join();
}
}
