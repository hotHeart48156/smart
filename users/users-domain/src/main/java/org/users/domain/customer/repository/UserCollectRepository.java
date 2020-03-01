package org.users.domain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.entity.UserCollect;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public interface UserCollectRepository extends JpaRepository<Id, UserCollect>, PagingAndSortingRepository<Id, UserCollect> {
}
