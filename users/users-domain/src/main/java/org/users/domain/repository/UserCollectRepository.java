package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.entity.UserCollect;
import org.users.domain.valueobject.id.Id;

/**
 * @author "yangbiao"
 */
public interface UserCollectRepository extends JpaRepository<Id, UserCollect>, PagingAndSortingRepository<Id, UserCollect>,Repository  {
}
