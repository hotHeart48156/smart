package org.product.dto.aggregationDto.aggre;

@Value
public class UserIdDto {
    private String UserId;
    private String userId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.userId));
    }
}
