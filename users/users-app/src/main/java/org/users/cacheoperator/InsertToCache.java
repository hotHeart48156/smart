package org.users.cacheoperator;

import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.entity.Entity;

/**
 * @author yangbiao
 */
@Component
public class InsertToCache extends AbstractCacheOperator {
    @Autowired
    private CacheChannel cacheChannel;
@Bean
    public <T extends Entity, R extends JpaRepository> String insert(String region, String key, T t, R r) {
        cacheChannel.set(region, key, t);
        return key + t.toString();
    }
}
