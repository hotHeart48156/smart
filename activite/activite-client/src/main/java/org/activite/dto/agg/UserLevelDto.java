package org.activite.dto.agg;

@Data
public class UserLevelDto {
    private String ActiviteId;
    private String userLevel;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setUserLevel(ValueObjectFactory.newInstance(UserLevel.class, this.userLevel));
    }
}
