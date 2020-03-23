package org.users.cache;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.aggregation.Aggregation;
import org.users.dto.AbstractDto;

/**
 * @author yangbiao
 */

public class DeleteCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache {
    private R r;
    public DeleteCache(T t,R r){
       r.deleteById(getKey());

    }
}
