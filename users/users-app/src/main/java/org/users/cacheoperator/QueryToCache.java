package org.users.cacheoperator;

import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.Entity;

import java.util.Collection;

/**
 * @author yangbiao
 */

public class QueryToCache {
    @Autowired
    private CacheChannel cacheChannel;
    public <T extends Entity, R extends JpaRepository> T query(String key, String region, T t, R r) {
        Collection<String> keys = cacheChannel.keys(region);
        if ( cacheChannel.exists(region, key)){
            return (T)cacheChannel.get(region,key);
        }
        return r.findById(t.g);
    }
}
