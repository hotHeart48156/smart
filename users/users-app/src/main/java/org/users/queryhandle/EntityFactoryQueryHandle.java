package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.EntityFactory;

import java.util.List;
public class EntityFactoryQueryHandle{
    @QueryHandler
public List<EntityFactory>query(EntityFactoryQuery query){


}}
