package org.activite.dto.agg;

@Data
public class CreateTimeDto {
    private String ActiviteId;
    private String createTime;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, this.createTime));
    }
}
