package org.product.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ProductSkuStockQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductSkuStock>  query(ProductSkuStockQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductSkuStock.class)).join();
}
}
