package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.CompanyAddress;
import org.order.executor.query.entity.CompanyAddressQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyAddressQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CompanyAddress>  query(CompanyAddressQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CompanyAddress.class)).join();
}
}
