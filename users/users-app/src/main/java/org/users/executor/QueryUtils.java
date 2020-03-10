package org.users.executor;

import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.entity.Entity;

import java.util.Optional;

/**
 * @author yangbiao
 */

public class QueryUtils {
    @Autowired
    CacheChannel cacheChannel;
    public <T extends Entity> T get(String key,T t){
       String region=t.getClass().getName();
       T entity=(T)cacheChannel.get(region,key);
       if (null==entity){
           entity=
       }
    }

}
