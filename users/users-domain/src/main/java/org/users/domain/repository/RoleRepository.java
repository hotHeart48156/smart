package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.users.domain.entity.Role;
import org.users.domain.valueobject.id.RoleId;

public interface RoleRepository extends Repository, JpaRepository<Role, RoleId> {
}
