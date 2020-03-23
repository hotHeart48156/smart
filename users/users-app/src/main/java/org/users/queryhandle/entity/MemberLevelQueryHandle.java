package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.MemberLevel;
import org.users.domain.repository.MemberLevelRepository;
import org.users.executor.query.entity.MemberLevelQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class MemberLevelQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    MemberLevelRepository repository;
@QueryHandler
public List<MemberLevel>query(MemberLevelQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
