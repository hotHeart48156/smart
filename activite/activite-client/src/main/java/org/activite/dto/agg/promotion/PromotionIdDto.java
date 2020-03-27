package org.activite.dto.agg.promotion;

import lombok.Data;
import org.activite.domain.aggregation.Promotion;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.PromotionId;

@Data
public class  PromotionIdDto extends AbstractPromotionDto {
private String promotionId;
public void accept(Promotion promotion){
promotion.setPromotionId(ValueObjectFactory.newInstance(PromotionId.class ,this.promotionId));
}
}
