package org.order.domain.customer.specification;

/**
 * @author "yangbiao"
 */
public class OrderGenerateSpecification extends AbstractSpecification {
    private OrderGenerate orderGenerate;

    private OrderGenerateSpecification(OrderGenerate orderGenerate) {
        this.orderGenerate = orderGenerate;
    }

    @Override
    public Boolean isSatisifedBy(Object o) {
        return orderGenerate.equals(o);
    }
}
