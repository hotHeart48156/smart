package org.activite.domain.aggregation;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "yangbiao"
 */

public abstract class AbstractAggregation {
    public abstract JpaRepository getRespository();

}
