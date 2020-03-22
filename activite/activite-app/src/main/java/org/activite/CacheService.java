package org.activite;

import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author yangbiao
 */
@Component

public class CacheService {
    @Autowired
     CacheChannel cacheChannel;
    public static void add(Map<String,String> data){

    }
}
