package org.product.dto.aggre;

@Data
public class VerifyStatusDto {
    private String ProductId;
    private String verifyStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setVerifyStatus(ValueObjectFactory.newInstance(VerifyStatus.class, this.verifyStatus));
    }
}
