package org.product.domain.repository.entity;

import org.product.domain.entity.MemberPrice;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.MemberPriceId;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface MemberPriceRepository extends Repository,JpaRepository<MemberPrice,MemberPriceId>{

}