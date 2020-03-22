package org.product.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ProductAttributeQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductAttribute>  query(ProductAttributeQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductAttribute.class)).join();
}
}
