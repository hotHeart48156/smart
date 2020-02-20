//  This codes are generated automatically. Do not modify!
package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.domain.support.DataOptional;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.function.Consumer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.vaueobject.UseIntegration;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.id.CartId;
import org.order.domain.customer.vaueobject.id.CartItemId;
import org.order.domain.customer.vaueobject.id.CouponId;
import org.order.domain.customer.vaueobject.id.GoodsId;
import org.order.domain.customer.vaueobject.id.GroupId;
import org.order.domain.customer.vaueobject.id.MemberId;
import org.order.domain.customer.vaueobject.id.ProductSkuId;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.PayType;

@Data
public abstract class BaseOrderGenerateUpdater<T extends BaseOrderGenerateUpdater> {
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "productSkuId"
    )
    private DataOptional<ProductSkuId> productSkuId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "payType"
    )
    private DataOptional<PayType> payType;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "cartItemIds"
    )
    private DataOptional<List<CartItemId>> cartItemIds;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "createTime"
    )
    private DataOptional<CreateTime> createTime;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "goodsId"
    )
    private DataOptional<GoodsId> goodsId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "cartId"
    )
    private DataOptional<CartId> cartId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "groupId"
    )
    private DataOptional<GroupId> groupId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "useIntegration"
    )
    private DataOptional<UseIntegration> useIntegration;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "couponId"
    )
    private DataOptional<CouponId> couponId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "addressId"
    )
    private DataOptional<AddressId> addressId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "memberId"
    )
    private DataOptional<MemberId> memberId;

    public T productSkuId(ProductSkuId productSkuId) {
        this.productSkuId = DataOptional.of(productSkuId);
        return (T) this;
    }

    public T acceptProductSkuId(Consumer<ProductSkuId> consumer) {
        if (this.productSkuId != null) {
            consumer.accept(this.productSkuId.getValue());
        }
        return (T) this;
    }

    public T payType(PayType payType) {
        this.payType = DataOptional.of(payType);
        return (T) this;
    }

    public T acceptPayType(Consumer<PayType> consumer) {
        if (this.payType != null) {
            consumer.accept(this.payType.getValue());
        }
        return (T) this;
    }

    public T cartItemIds(List<CartItemId> cartItemIds) {
        this.cartItemIds = DataOptional.of(cartItemIds);
        return (T) this;
    }

    public T acceptCartItemIds(Consumer<List<CartItemId>> consumer) {
        if (this.cartItemIds != null) {
            consumer.accept(this.cartItemIds.getValue());
        }
        return (T) this;
    }

    public T createTime(CreateTime createTime) {
        this.createTime = DataOptional.of(createTime);
        return (T) this;
    }

    public T acceptCreateTime(Consumer<CreateTime> consumer) {
        if (this.createTime != null) {
            consumer.accept(this.createTime.getValue());
        }
        return (T) this;
    }

    public T goodsId(GoodsId goodsId) {
        this.goodsId = DataOptional.of(goodsId);
        return (T) this;
    }

    public T acceptGoodsId(Consumer<GoodsId> consumer) {
        if (this.goodsId != null) {
            consumer.accept(this.goodsId.getValue());
        }
        return (T) this;
    }

    public T cartId(CartId cartId) {
        this.cartId = DataOptional.of(cartId);
        return (T) this;
    }

    public T acceptCartId(Consumer<CartId> consumer) {
        if (this.cartId != null) {
            consumer.accept(this.cartId.getValue());
        }
        return (T) this;
    }

    public T groupId(GroupId groupId) {
        this.groupId = DataOptional.of(groupId);
        return (T) this;
    }

    public T acceptGroupId(Consumer<GroupId> consumer) {
        if (this.groupId != null) {
            consumer.accept(this.groupId.getValue());
        }
        return (T) this;
    }

    public T useIntegration(UseIntegration useIntegration) {
        this.useIntegration = DataOptional.of(useIntegration);
        return (T) this;
    }

    public T acceptUseIntegration(Consumer<UseIntegration> consumer) {
        if (this.useIntegration != null) {
            consumer.accept(this.useIntegration.getValue());
        }
        return (T) this;
    }

    public T couponId(CouponId couponId) {
        this.couponId = DataOptional.of(couponId);
        return (T) this;
    }

    public T acceptCouponId(Consumer<CouponId> consumer) {
        if (this.couponId != null) {
            consumer.accept(this.couponId.getValue());
        }
        return (T) this;
    }

    public T addressId(AddressId addressId) {
        this.addressId = DataOptional.of(addressId);
        return (T) this;
    }

    public T acceptAddressId(Consumer<AddressId> consumer) {
        if (this.addressId != null) {
            consumer.accept(this.addressId.getValue());
        }
        return (T) this;
    }

    public T memberId(MemberId memberId) {
        this.memberId = DataOptional.of(memberId);
        return (T) this;
    }

    public T acceptMemberId(Consumer<MemberId> consumer) {
        if (this.memberId != null) {
            consumer.accept(this.memberId.getValue());
        }
        return (T) this;
    }

    public void accept(OrderGenerate target) {
        this.acceptProductSkuId(target::setProductSkuId);
        this.acceptPayType(target::setPayType);
        this.acceptCartItemIds(target::setCartItemIds);
        this.acceptCreateTime(target::setCreateTime);
        this.acceptGoodsId(target::setGoodsId);
        this.acceptCartId(target::setCartId);
        this.acceptGroupId(target::setGroupId);
        this.acceptUseIntegration(target::setUseIntegration);
        this.acceptCouponId(target::setCouponId);
        this.acceptAddressId(target::setAddressId);
        this.acceptMemberId(target::setMemberId);
    }
}
