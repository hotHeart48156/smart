package org.users.cache;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.aggregation.Aggregation;
import org.users.dto.AbstractDto;

/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Component
public class UpdateCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache{

}
