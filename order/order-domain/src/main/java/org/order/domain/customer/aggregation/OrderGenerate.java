package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenApplicationMethod;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.*;
import org.order.domain.customer.vaueobject.UseIntegration;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.customer.vaueobject.name.GoodsName;
import org.order.domain.customer.vaueobject.name.UserName;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.PayType;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@AllArgsConstructor
@Data
public class OrderGenerate extends JpaAggregate {
    private Address address;
    private Coupon coupon;
    private MemberId memberId;
    private CartId cartId;
    private List<CartItemId> cartItemIds;
    private GoodsId goodsId;
    private GoodsName goodsName;
    private ProductSkuId productSkuId;
    private GroupId groupId;
    private UseIntegration useIntegration;
    private PayType payType;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
