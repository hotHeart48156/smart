package com.smart.website;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.J2Cache;
import org.springframework.stereotype.Service;

/**
 * @author "yangbiao"
 */
@Service
public class Cache {
    CacheChannel cacheChannel= J2Cache.getChannel();

    public void save(User user) {
        cacheChannel.set("default","56156216589",user.toString() );

    }
    public Cache(){}
}
