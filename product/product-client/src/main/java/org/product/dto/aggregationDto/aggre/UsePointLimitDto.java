package org.product.dto.aggregationDto.aggre;

@Value
public class UsePointLimitDto {
    private String UserId;
    private String usePointLimit;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setUsePointLimit(ValueObjectFactory.newInstance(UsePointLimit.class, this.usePointLimit));
    }
}
