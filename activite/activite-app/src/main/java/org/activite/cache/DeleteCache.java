package org.activite.cache;


import org.activite.domain.aggregation.Aggregation;
import org.activite.dto.AbstractDto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangbiao
 */

public class DeleteCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache {
    private R r;
    public DeleteCache(T t,R r){
       r.deleteById(getKey());

    }
}
