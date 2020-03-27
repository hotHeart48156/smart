package  org.activite.service.query.entity;

import org.activite.domain.entity.HomeNewProduct;
import org.activite.executor.query.entity.HomeNewProductQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeNewProductQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<HomeNewProduct>  query(HomeNewProductQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(HomeNewProduct.class)).join();
}
}
