package org.product.dto.aggdto;

@Data
public class FactoryStatusDto {
    private String ProductId;
    private String factoryStatus;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setFactoryStatus(ValueObjectFactory.newInstance(FactoryStatus.class, this.factoryStatus));
    }
}
