package org.users.cache;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.entity.Entity;

import javax.transaction.Transactional;

/**
 * @author yangbiao
 */
@Component
public class CacheService <T extends Entity>{
    @Autowired
    private CacheChannel cacheChannel;
    @Transactional
    public  String create(CommandCache commandCache) {
        cacheChannel.set(commandCache.getRegion(),commandCache.getKey(),commandCache.getT());
        try {
            commandCache.getR().save(commandCache.getT());
            return "succeed create";

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return null;
        }
    }


public void update(CommandCache commandCache){
            T t= (T) commandCache.getT();
            String key=commandCache.getKey();
           CacheObject cacheObject= cacheChannel.get(commandCache.getRegion(),key);
           commandCache.getR().save(cacheObject.getValue());
}

    @Transactional
    public <T extends Entity, R extends JpaRepository> T query(QueryCache queryCache) {
        CacheObject cacheObject=cacheChannel.get(queryCache.getRegion(),queryCache.getKey());
       return (T) cacheObject.getValue();

    }


}
