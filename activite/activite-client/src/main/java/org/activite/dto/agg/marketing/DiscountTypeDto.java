package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.type.DiscountType;

@Data
public class  DiscountTypeDto  extends AbstractMarketingDto{
private String discountType;
public void accept(Marketing marketing){
marketing.setDiscountType(ValueObjectFactory.newInstance(DiscountType.class ,this.discountType));
}
}
