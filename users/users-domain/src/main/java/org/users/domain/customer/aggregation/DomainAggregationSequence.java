package org.users.domain.customer.aggregation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author "yangbiao"
 */
@Entity
@Table(indexes = @Index(columnList = "aggregateIdentifier,type", unique = true))
@Getter
@Setter
@NoArgsConstructor
public class DomainAggregationSequence {
    @Id
    @GeneratedValue
    private Long id;

    private Long sequenceNumber;

    private Long aggregateIdentifier;

    private String type;
}
