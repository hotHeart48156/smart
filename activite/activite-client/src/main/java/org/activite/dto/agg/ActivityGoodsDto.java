package org.activite.dto.agg;

@Data
public class ActivityGoodsDto {
    private String ActiviteId;
    private String activityGoods;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setActivityGoods(ValueObjectFactory.newInstance(ActivityGoods.class, this.activityGoods));
    }
}
