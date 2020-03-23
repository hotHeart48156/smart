package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.MemberLevel;
import org.users.domain.valueobject.id.MemberLevelId;

/**
 * @author yangbiao
 */

public  interface MemberLevelRepository extends Repository, JpaRepository<MemberLevel, MemberLevelId> {
}
