package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ProductAttributes;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  ProductAttributesDto  extends AbstractCouponDto{
private String productAttributes;
public void accept(Coupon coupon){
coupon.setProductAttributes(ValueObjectFactory.newInstance(ProductAttributes.class ,this.productAttributes));
}
}
