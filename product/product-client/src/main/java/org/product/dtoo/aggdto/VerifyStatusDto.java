package org.product.dtoo.aggdto;

@Data
public class VerifyStatusDto {
    private String ProductId;
    private String verifyStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setVerifyStatus(ValueObjectFactory.newInstance(VerifyStatus.class, this.verifyStatus));
    }
}
