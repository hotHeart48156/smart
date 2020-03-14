package org.product.dto.aggdto;

@Data
public class IdDto {
    private String ProductId;
    private String brandId;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setId(ValueObjectFactory.newInstance(Id.class, this.brandId));
    }
}
