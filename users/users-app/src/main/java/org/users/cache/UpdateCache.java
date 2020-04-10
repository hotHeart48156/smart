package org.users.cache;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.users.domain.aggregation.Aggregation;
import org.users.dto.AbstractDto;

/**
 * @author yangbiao
 */
@Component
public class UpdateCache <T extends AbstractDto,A extends Aggregation,R extends JpaRepository> extends Cache{

}
