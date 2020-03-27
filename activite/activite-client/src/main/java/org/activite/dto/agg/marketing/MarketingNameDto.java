package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.name.MarketingName;

@Data
public class  MarketingNameDto  extends AbstractMarketingDto{
private String marketingName;
public void accept(Marketing marketing){
marketing.setMarketingName(ValueObjectFactory.newInstance(MarketingName.class ,this.marketingName));
}
}
