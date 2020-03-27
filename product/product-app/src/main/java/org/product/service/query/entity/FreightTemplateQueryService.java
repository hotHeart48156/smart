package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.FreightTemplate;
import org.product.executor.query.entity.FreightTemplateQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class FreightTemplateQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<FreightTemplate>  query(FreightTemplateQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(FreightTemplate.class)).join();
}
}
