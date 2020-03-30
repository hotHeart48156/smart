package org.product.cache;

/**
 * @author yangbiao
 */

import org.product.domain.aggragate.Aggregation;
import org.product.dto.AbstractDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public class CommandCache<T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache {


    private R r;
    private T t;
    public CommandCache(T t,R r){
        this.r=r;
        this.t=t;
    }

    public R getR() {
        return r;
    }

    @Override
    public T getT() {
        return t;
    }
}
