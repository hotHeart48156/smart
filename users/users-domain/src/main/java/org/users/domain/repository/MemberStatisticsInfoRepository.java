package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.MemberStatisticsInfo;
import org.users.domain.valueobject.id.Id;

public interface MemberStatisticsInfoRepository extends Repository, JpaRepository<MemberStatisticsInfo, Id> {
}
