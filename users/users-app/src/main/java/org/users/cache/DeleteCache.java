package org.users.cache;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.aggregation.Aggregation;
import org.users.domain.entity.Entity;

/**
 * @author yangbiao
 */

public class DeleteCache <T extends Entity,A extends Aggregation,R extends JpaRepository> extends Cache {
    private R r;
    public DeleteCache(R r){
       r.deleteById(getKey());

    }
}
