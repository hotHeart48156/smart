package org.users.domain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.id.UserId;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.customer.valueobject.id.WeixinOpenId;
import org.users.domain.customer.valueobject.name.UserName;

import java.util.Optional;

/**
 * @author "yangbiao"
 */
public interface UserRepository extends JpaRepository<User, UserId>, PagingAndSortingRepository<User, UserId> {

    Optional<User> findById(WeixinOpenId openId);

    Optional<User> findById(UserName userName);
}
