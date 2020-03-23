package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Address;
import org.users.domain.repository.AddressRepository;
import org.users.executor.query.entity.AddressQuery;

import java.util.List;
public class AddressQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
private CacheService service ;
private CacheService service ;
private CacheService service ;
@Autowired
@Autowired
@Autowired
CacheService service @Autowired
    CacheService cacheService;
    @Autowired
    AddressRepository repository;
    @QueryHandler
public List<Address>query(AddressQuery query){
return cacheService.query(new QueryCache(query,repository))

}}
