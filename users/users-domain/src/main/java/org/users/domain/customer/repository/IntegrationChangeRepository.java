package org.users.domain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.entity.IntegrationChangeHistoryItem;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public interface IntegrationChangeRepository extends JpaRepository<Id, IntegrationChangeHistoryItem>, PagingAndSortingRepository<Id, IntegrationChangeHistoryItem> {
}
