package org.activite.dto.agg;

@Data
public class StartTimeDto {
    private String ActiviteId;
    private String startTime;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setStartTime(ValueObjectFactory.newInstance(StartTime.class, this.startTime));
    }
}
