package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ActivityGoods;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class ActivityGoodsDto {
    private String ActiviteId;
    private String activityGoods;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setActivityGoods(ValueObjectFactory.newInstance(ActivityGoods.class, this.activityGoods));
    }
}
