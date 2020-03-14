package org.activite.dto.agg;

@Data
public class EndTimeDto {
    private String ActiviteId;
    private String endTime;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setEndTime(ValueObjectFactory.newInstance(EndTime.class, this.endTime));
    }
}
