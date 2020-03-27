package org.activite.cache;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.activite.domain.aggregation.Aggregation;
import org.activite.dto.AbstractDto;
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


    public UpdateCache(R r){
        this.r=r;
    }

}
