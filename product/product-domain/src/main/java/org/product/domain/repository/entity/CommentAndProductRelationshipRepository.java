package org.product.domain.repository.entity;

import org.product.domain.entity.CommentAndProductRelationship;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface CommentAndProductRelationshipRepository extends Repository,JpaRepository<CommentAndProductRelationship,Id>{

}