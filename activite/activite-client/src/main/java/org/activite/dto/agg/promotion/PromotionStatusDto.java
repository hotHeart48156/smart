package org.activite.dto.agg.promotion;

import lombok.Data;
import org.activite.domain.aggregation.Promotion;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.status.PromotionStatus;

@Data
public class  PromotionStatusDto extends AbstractPromotionDto {
private String promotionStatus;
public void accept(Promotion promotion){
promotion.setPromotionStatus(ValueObjectFactory.newInstance(PromotionStatus.class ,this.promotionStatus));
}
}
