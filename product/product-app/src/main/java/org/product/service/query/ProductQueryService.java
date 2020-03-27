package org.product.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.aggragate.Product;
import org.product.executor.query.aggre.ProductQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Product>  query(ProductQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Product.class)).join();
}
}
