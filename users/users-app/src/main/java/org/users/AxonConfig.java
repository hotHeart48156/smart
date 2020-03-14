package org.users;

import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.spring.eventsourcing.SpringPrototypeAggregateFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author "yangbiao"
 */
@Configuration
public class AxonConfig {
    @Autowired
    private EventStore eventStore;

    @Bean
    public AggregateFactory<BankAccountAggregate> bankAccountAggregateAggregateFactory() {
        SpringPrototypeAggregateFactory<BankAccountAggregate> aggregateFactory = new SpringPrototypeAggregateFactory<>();
        aggregateFactory.setPrototypeBeanName("bankAccountAggregate");
        return aggregateFactory;
    }

    @Bean
    public Repository<BankAccountAggregate> bankAccountAggregateRepository() {
        EventSourcingRepository<BankAccountAggregate> repository = new EventSourcingRepository<BankAccountAggregate>(
                bankAccountAggregateAggregateFactory(),
                eventStore
        );
        return repository;
    }
}
