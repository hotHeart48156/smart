package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.Address;
import org.users.executor.query.entity.AddressQuery;

import java.util.List;
public class AddressQueryHandle{
    @QueryHandler
public List<Address>query(AddressQuery query){


}}
