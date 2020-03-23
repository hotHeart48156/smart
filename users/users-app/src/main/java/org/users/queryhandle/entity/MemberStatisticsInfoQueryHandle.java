package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.MemberStatisticsInfo;
import org.users.domain.repository.MemberStatisticsInfoRepository;
import org.users.executor.query.entity.MemberStatisticsInfoQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class MemberStatisticsInfoQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    MemberStatisticsInfoRepository repository;
 @QueryHandler
public List<MemberStatisticsInfo>query(MemberStatisticsInfoQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
