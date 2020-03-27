package org.activite.dto.agg.promotion;

import lombok.Data;
import org.activite.domain.aggregation.Promotion;
import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  TitleDto extends AbstractPromotionDto {
private String title;
public void accept(Promotion promotion){
promotion.setTitle(ValueObjectFactory.newInstance(Title.class ,this.title));
}
}
