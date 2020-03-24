package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Address;
import org.users.domain.repository.AddressRepository;
import org.users.executor.query.entity.AddressQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class AddressQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;

    @Autowired
    AddressRepository repository;
    @QueryHandler
public List<Address>query(AddressQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
