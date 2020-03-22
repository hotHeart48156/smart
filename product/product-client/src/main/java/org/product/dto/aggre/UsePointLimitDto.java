package org.product.dto.aggre;

@Data
public class UsePointLimitDto {
    private String ProductId;
    private String usePointLimit;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setUsePointLimit(ValueObjectFactory.newInstance(UsePointLimit.class, this.usePointLimit));
    }
}
