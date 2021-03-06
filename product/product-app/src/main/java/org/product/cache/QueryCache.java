package org.product.cache;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.product.domain.aggragate.Aggregation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author yangbiao
 */
@Component
@Data
@AllArgsConstructor

public class QueryCache <A extends Aggregation,R extends JpaRepository> extends Cache  {

    private R r;
    private String key;
    public QueryCache(String key,R r){
        this.r=r;
        this.key=key;
    }



}
