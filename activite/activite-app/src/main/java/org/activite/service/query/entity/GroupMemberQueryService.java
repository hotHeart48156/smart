package  org.activite.service.query.entity;

import org.activite.domain.entity.GroupMember;
import org.activite.executor.query.entity.GroupMemberQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GroupMemberQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<GroupMember>  query(GroupMemberQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(GroupMember.class)).join();
}
}
