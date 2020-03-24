package org.users.cache;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.users.dto.AbstractDto;

import java.util.Date;
import java.util.Objects;

/**
 * @author yangbiao
 */
@Data
public abstract class Cache <T extends AbstractDto,R extends JpaRepository> {
    private String region;
    private String key;
    private T t;
    @Autowired
    RedisTemplate redisTemplate;

    public <T extends AbstractDto, R extends JpaRepository> Cache(T t, R r) {
    }

    public void genRegion(){
        region="user";
    }
    public void genKey(){


        RedisAtomicLong id=new RedisAtomicLong(new Date(System.currentTimeMillis()).toString(), Objects.requireNonNull(redisTemplate.getConnectionFactory()));
        key=id.toString();

    }
    public Cache(T t){
        this.t=t;
    }
    public Cache(){}
}
