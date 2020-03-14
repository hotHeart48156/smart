package org.activite.dto.agg;

@Data
public class MarketingNameDto {
    private String ActiviteId;
    private String marketingName;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setMarketingName(ValueObjectFactory.newInstance(MarketingName.class, this.marketingName));
    }
}
