package org.order.cache;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.aggregation.Aggregation;
import org.order.dto.AbstractDto;
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
  private T t;

    public UpdateCache(T t,R r){
        this.r=r;
    }

}
