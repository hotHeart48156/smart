package org.activite.cache;

import lombok.Data;
import org.activite.domain.aggregation.Aggregation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

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
