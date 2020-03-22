package org.product.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ProductFullReductionQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductFullReduction>  query(ProductFullReductionQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductFullReduction.class)).join();
}
}
