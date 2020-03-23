package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.GrowthChangeHistoryItem;
import org.users.domain.valueobject.id.GrowthChangeHistoryId;

public interface GrowthChangeHistoryItemRepository extends Repository, JpaRepository<GrowthChangeHistoryItem, GrowthChangeHistoryId> {
}
