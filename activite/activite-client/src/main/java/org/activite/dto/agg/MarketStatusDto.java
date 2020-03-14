package org.activite.dto.agg;

@Data
public class MarketStatusDto {
    private String ActiviteId;
    private String marketStatus;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setMarketStatus(ValueObjectFactory.newInstance(MarketStatus.class, this.marketStatus));
    }
}
