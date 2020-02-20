//  This codes are generated automatically. Do not modify!
package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.domain.AggregateRepository;

import java.lang.Long;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.Repository;

interface BaseOrderDeliveryRepository extends AggregateRepository<Long, OrderDelivery>, Repository<OrderDelivery, Long>, QuerydslPredicateExecutor<OrderDelivery> {
}
