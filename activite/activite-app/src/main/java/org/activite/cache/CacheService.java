package org.activite.cache;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheObject;
import org.activite.domain.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

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



    @Transactional
    public <T extends Entity, R extends JpaRepository> List<T> query(QueryCache queryCache) {
        CacheObject cacheObject=cacheChannel.get(queryCache.getRegion(),queryCache.getKey());
        return (List<T>) cacheObject.getValue();

    }

    @Transactional
    public void update(UpdateCache cache){
        cache.getT();

    }


}
