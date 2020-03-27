package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.status.MarketStatus;

@Data
public class  MarketStatusDto  extends AbstractMarketingDto{
private String marketStatus;
public void accept(Marketing marketing){
marketing.setMarketStatus(ValueObjectFactory.newInstance(MarketStatus.class ,this.marketStatus));
}
}
