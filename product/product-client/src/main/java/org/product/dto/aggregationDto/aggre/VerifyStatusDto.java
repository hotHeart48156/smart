package org.product.dto.aggregationDto.aggre;

@Value
public class VerifyStatusDto {
    private String UserId;
    private String verifyStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setVerifyStatus(ValueObjectFactory.newInstance(VerifyStatus.class, this.verifyStatus));
    }
}
