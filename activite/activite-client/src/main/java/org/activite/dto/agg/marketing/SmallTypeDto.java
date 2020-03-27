package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.type.SmallType;

@Data
public class  SmallTypeDto  extends AbstractMarketingDto{
private String smallType;
public void accept(Marketing marketing){
marketing.setSmallType(ValueObjectFactory.newInstance(SmallType.class ,this.smallType));
}
}
