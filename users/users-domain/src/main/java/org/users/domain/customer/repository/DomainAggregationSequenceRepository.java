package org.users.domain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "yangbiao"
 */
public interface DomainAggregationSequenceRepository extends JpaRepository<DomainAggregationSequence, Long> {
    DomainAggregationSequence findByAggregateIdentifierAndType(Long identifier, String type);
}
