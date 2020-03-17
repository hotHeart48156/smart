package org.users;

import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.Entity;

import java.util.Collection;

/**
 * @author yangbiao
 */

public class CacheService {
    @Autowired
    private CacheChannel cacheChannel;

    public <T extends Entity, R extends JpaRepository> String create(String region, String key, T t, R r) {
        cacheChannel.set(region, key, t);
        return key + t.toString();
    }

    public <T extends Entity, R extends JpaRepository> void createq(String region, String key, T t, R r) {
        r.save(t);
    }



    public <T extends Entity, R extends JpaRepository> void delete(String key) {

    }


}
