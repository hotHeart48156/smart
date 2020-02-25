package org.users.domain.customer.aggregation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.customer.valueobject.id.UserId;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author "yangbiao"
 */
public interface UserRepository extends JpaRepository<User, UserId>, PagingAndSortingRepository<User, UserId> {
}
