package org.product.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.aggragate.Brand;
import org.product.executor.query.aggre.BrandQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Brand>  query(BrandQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Brand.class)).join();
}
}
