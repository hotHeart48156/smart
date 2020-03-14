package org.product.dto.aggdto;

@Data
public class ShowStatusDto {
    private String ProductId;
    private String showStatus;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setShowStatus(ValueObjectFactory.newInstance(ShowStatus.class, this.showStatus));
    }
}
