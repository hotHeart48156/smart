package org.users.cache;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.aggregation.Aggregation;
import org.users.domain.entity.Entity;

/**
 * @author yangbiao
 */
@Component
@Data
public class QueryCache <T extends Entity,A extends Aggregation,R extends JpaRepository> extends Cache  {

    private R r;
    public QueryCache(T t,R r){
        this.r=r;
    }
    
}
