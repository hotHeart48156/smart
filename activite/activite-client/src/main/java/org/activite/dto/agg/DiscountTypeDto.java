package org.activite.dto.agg;

@Data
public class DiscountTypeDto {
    private String ActiviteId;
    private String discountType;

    public void accept(Marketing marketing) {
        marketing.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        marketing.setDiscountType(ValueObjectFactory.newInstance(DiscountType.class, this.discountType));
    }
}
