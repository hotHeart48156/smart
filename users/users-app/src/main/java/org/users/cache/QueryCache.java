package org.users.cache;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.aggregation.Aggregation;

/**
 * @author yangbiao
 */
@Component
@Data
public class QueryCache <A extends Aggregation,R extends JpaRepository> extends Cache  {

    private R r;
    private String key;
    public QueryCache(String key,R r){
        this.r=r;
        this.key=key;
    }



}
