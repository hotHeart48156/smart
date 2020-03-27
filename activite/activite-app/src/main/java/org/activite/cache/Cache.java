package org.activite.cache;

import lombok.Data;
import org.activite.dto.AbstractDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;

import java.util.Date;
import java.util.Objects;

/**
 * @author yangbiao
 */
@Data
public abstract class Cache <T extends AbstractDto,R extends JpaRepository> {
    @Autowired
    RedisTemplate redisTemplate;
    private String region;
    private String key;
    private T t;

    public <T extends AbstractDto, R extends JpaRepository> Cache(T t, R r) {
    }

    public Cache(T t){
        this.t=t;
    }
    public Cache(){}

    public void genRegion(){
        region="user";
    }

    public void genKey(){


        RedisAtomicLong id=new RedisAtomicLong(new Date(System.currentTimeMillis()).toString(), Objects.requireNonNull(redisTemplate.getConnectionFactory()));
        key=id.toString();

    }
}
