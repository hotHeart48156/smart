package org.product.cache;


import lombok.AllArgsConstructor;
import org.product.domain.aggragate.Aggregation;
import org.product.dto.AbstractDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author yangbiao
 */
@Component
@AllArgsConstructor

public class DeleteCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache {
    private R r;
    public DeleteCache(T t,R r){
       r.deleteById(getKey());

    }
}
