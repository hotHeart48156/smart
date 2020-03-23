package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.EndTime;

@Data
public class EndTimeDto {
    private String ActiviteId;
    private String endTime;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setEndTime(ValueObjectFactory.newInstance(EndTime.class, this.endTime));
    }
}
