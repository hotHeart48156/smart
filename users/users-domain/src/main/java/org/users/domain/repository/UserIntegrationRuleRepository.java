package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.UserIntegrationRule;
import org.users.domain.valueobject.id.Id;

/**
 * @author yangbiao
 */

public interface UserIntegrationRuleRepository extends Repository, JpaRepository<UserIntegrationRule, Id> {
}
