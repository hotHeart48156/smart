package org.activite.dto.agg.marketing;

@Data
public class ActivityUserDto {
    private String ActiviteId;
    private String activityUser;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setActivityUser(ValueObjectFactory.newInstance(ActivityUser.class, this.activityUser));
    }
}
