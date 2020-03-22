package org.product.dto.aggre;

@Data
public class FeightTemplateIdDto {
    private String ProductId;
    private String feightTemplateId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setFeightTemplateId(ValueObjectFactory.newInstance(FeightTemplateId.class, this.feightTemplateId));
    }
}
