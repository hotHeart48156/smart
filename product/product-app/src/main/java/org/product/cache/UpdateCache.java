package org.product.cache;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.product.domain.aggragate.Aggregation;
import org.product.dto.AbstractDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Component
public class UpdateCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache{
    private R r;

    public UpdateCache(T t,R r){
        this.r=r;
    }

}
