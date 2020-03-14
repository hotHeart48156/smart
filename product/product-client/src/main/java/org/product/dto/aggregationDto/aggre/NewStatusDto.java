package org.product.dto.aggregationDto.aggre;

@Value
public class NewStatusDto {
    private String UserId;
    private String newStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setNewStatus(ValueObjectFactory.newInstance(NewStatus.class, this.newStatus));
    }
}
