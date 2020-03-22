package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.id.UserId;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.valueobject.id.WeixinOpenId;
import org.users.domain.valueobject.name.UserName;

import java.util.Optional;

/**
 * @author "yangbiao"
 */
public interface UserRepository extends JpaRepository<User, UserId>, PagingAndSortingRepository<User, UserId> ,Repository {

    Optional<User> findById(WeixinOpenId openId);

    Optional<User> findById(UserName userName);
}
