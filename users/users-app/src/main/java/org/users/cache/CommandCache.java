package org.users.cache;

/**
 * @author yangbiao
 */

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.aggregation.Aggregation;
import org.users.domain.entity.Entity;
@Data
@Component
public class CommandCache<T extends Entity,A extends Aggregation,R extends JpaRepository> extends Cache {


    private R r;
    public CommandCache(T t){

    }



}
