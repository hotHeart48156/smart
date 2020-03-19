package org.activite.service.query;

import org.activite.domain.aggregation.Coupon;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yangbiao
 */

public class CouponQuery {
    @Autowired
    private QueryGateway queryGateway;

    public List<Coupon> query(CouponQuery query){
        return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Coupon.class)).join();

    }
}
