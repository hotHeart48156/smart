package org.activite.dto.agg;

@Data
public class MarketingIdDto {
    private String ActiviteId;
    private String marketingId;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setMarketingId(ValueObjectFactory.newInstance(MarketingId.class, this.marketingId));
    }
}
