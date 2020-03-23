package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.Tag;
import org.users.domain.valueobject.id.TagId;

public interface TagRepository extends Repository, JpaRepository<Tag, TagId> {
}
