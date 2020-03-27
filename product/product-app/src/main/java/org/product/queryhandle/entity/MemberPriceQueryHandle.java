package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.MemberPrice;
import org.product.domain.repository.entity.MemberPriceRepository;
import org.product.executor.query.entity.MemberPriceQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberPriceQueryHandle{
  @Autowired
private MemberPriceRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<MemberPrice>query(MemberPriceQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
