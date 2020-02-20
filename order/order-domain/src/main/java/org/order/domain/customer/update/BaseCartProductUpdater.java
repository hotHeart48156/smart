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
import org.order.domain.customer.vaueobject.attr.ProductAttributes;
import org.order.domain.customer.vaueobject.id.ProductSkuId;
import org.order.domain.customer.vaueobject.time.CreateTime;

@Data
public abstract class BaseCartProductUpdater<T extends BaseCartProductUpdater> {
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
            name = "productAttributes"
    )
    private DataOptional<List<ProductAttributes>> productAttributes;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "productSkuIds"
    )
    private DataOptional<List<ProductSkuId>> productSkuIds;

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

    public T productAttributes(List<ProductAttributes> productAttributes) {
        this.productAttributes = DataOptional.of(productAttributes);
        return (T) this;
    }

    public T acceptProductAttributes(Consumer<List<ProductAttributes>> consumer) {
        if (this.productAttributes != null) {
            consumer.accept(this.productAttributes.getValue());
        }
        return (T) this;
    }

    public T productSkuIds(List<ProductSkuId> productSkuIds) {
        this.productSkuIds = DataOptional.of(productSkuIds);
        return (T) this;
    }

    public T acceptProductSkuIds(Consumer<List<ProductSkuId>> consumer) {
        if (this.productSkuIds != null) {
            consumer.accept(this.productSkuIds.getValue());
        }
        return (T) this;
    }

    public void accept(CartProduct target) {
        this.acceptCreateTime(target::setCreateTime);
        this.acceptProductAttributes(target::setProductAttributes);
        this.acceptProductSkuIds(target::setProductSkuIds);
    }
}
