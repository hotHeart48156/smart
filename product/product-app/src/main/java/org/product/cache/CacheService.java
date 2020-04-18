package org.product.cache;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheObject;
import org.product.domain.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yangbiao
 */
@Service

public class CacheService <T extends Entity> {

    public CacheService() {
    }
    @PostConstruct
    void init(){

    }
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
            cacheChannel.close();
        }
        return null;
    }



    @Transactional
    public <T extends Entity, R extends JpaRepository> List<T> query(QueryCache queryCache) {
        CacheObject cacheObject=cacheChannel.get(queryCache.getRegion(),queryCache.getKey());
        return (List<T>) cacheObject.getValue();

    }

    @Transactional
    public void update(UpdateCache cache){
        try {
            cache.getT();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
