//  This codes are generated automatically. Do not modify!
package org.order.api.application;

import com.geekhalo.ddd.lite.codegen.Description;
import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.domain.customer.aggregation.CartProduct;
import org.order.domain.customer.aggregation.CartPromotionItem;
import org.order.domain.customer.aggregation.ConfirmOrderResult;
import org.order.domain.customer.aggregation.GroupAndOrder;
import org.order.domain.customer.aggregation.Market;
import org.order.domain.customer.aggregation.MoneyInfo;
import org.order.domain.customer.aggregation.OrderApply;
import org.order.domain.customer.aggregation.OrderDelivery;
import org.order.domain.customer.aggregation.OrderDetail;
import org.order.domain.customer.aggregation.OrderGenerate;
import org.order.domain.customer.aggregation.OrderQuery;
import org.order.domain.customer.aggregation.OrderReason;
import org.order.domain.customer.aggregation.ReceivedStatusUpdate;
import org.order.domain.customer.aggregation.ReceiverInfo;
import org.order.domain.customer.entity.OrderOperateHistory;
import org.order.domain.customer.entity.OrderReturnApply;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.transaction.annotation.Transactional;

abstract class BaseAuthApplication extends AbstractApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    protected BaseAuthApplication(Logger logger) {
        super(logger);
    }

    protected BaseAuthApplication() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, ReceivedStatusUpdate> getReceivedStatusUpdateRepository(
    );

    protected abstract AggregateRepository<Long, CartProduct> getCartProductRepository();

    protected abstract AggregateRepository<Long, MoneyInfo> getMoneyInfoRepository();

    protected abstract AggregateRepository<Long, CartPromotionItem> getCartPromotionItemRepository();

    protected abstract AggregateRepository<Long, OrderApply> getOrderApplyRepository();

    @Transactional
    public Long createOrderApply(OrderId orderId, OrderReturnApply orderReturnApply,
                                 OrderOperateHistory orderOperateHistory) {
        OrderApply result = creatorFor(this.getOrderApplyRepository())
                .publishBy(getDomainEventBus())
                .instance(() -> OrderApply.create(orderId, orderReturnApply, orderOperateHistory))
                .call();
        logger().info("success to create {} using parm {}, {}, {}", result.getId(), orderId, orderReturnApply, orderOperateHistory);
        return result.getId();
    }

    protected ApplicationEventPublisher getApplicationEventPublisher() {
        return this.applicationEventPublisher;
    }

    @Transactional
    public void update(@Description("主键") Long id, OrderApply orderApply) {
        OrderApply result = updaterFor(this.getOrderApplyRepository())
                .publishBy(getDomainEventBus())
                .id(id)
                .update(agg -> agg.update(orderApply, getApplicationEventPublisher()))
                .call();
        logger().info("success to update for {} using param {}, {}", id, orderApply, getApplicationEventPublisher());
    }

    protected abstract AggregateRepository<Long, OrderQuery> getOrderQueryRepository();

    protected abstract AggregateRepository<Long, OrderDetail> getOrderDetailRepository();

    protected abstract AggregateRepository<Long, OrderGenerate> getOrderGenerateRepository();

    protected abstract AggregateRepository<Long, ConfirmOrderResult> getConfirmOrderResultRepository(
    );

    protected abstract AggregateRepository<Long, Market> getMarketRepository();

    protected abstract AggregateRepository<Long, GroupAndOrder> getGroupAndOrderRepository();

    protected abstract AggregateRepository<Long, OrderReason> getOrderReasonRepository();

    protected abstract AggregateRepository<Long, ReceiverInfo> getReceiverInfoRepository();

    protected abstract AggregateRepository<Long, OrderDelivery> getOrderDeliveryRepository();
}
