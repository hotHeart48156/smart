package org.activite.dto.agg.marketing;

@Data
public class SmallTypeDto {
    private String ActiviteId;
    private String smallType;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setSmallType(ValueObjectFactory.newInstance(SmallType.class, this.smallType));
    }
}
