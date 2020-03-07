package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.entity.AppletSet;
import org.users.domain.valueobject.id.Id;

/**
 * @author "yangbiao"
 */
public interface AppletSetRepository extends JpaRepository<Id, AppletSet>, PagingAndSortingRepository<Id, AppletSet> {
}
