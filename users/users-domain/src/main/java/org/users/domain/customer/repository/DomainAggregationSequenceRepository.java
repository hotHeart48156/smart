package org.users.domain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.customer.aggregation.DomainAggregationSequence;

/**
 * @author "yangbiao"
 */
public interface DomainAggregationSequenceRepository extends JpaRepository<DomainAggregationSequence, Long> {
    DomainAggregationSequence findByAggregateIdentifierAndType(Long identifier, String type);
}
