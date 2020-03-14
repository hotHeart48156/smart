package org.product.dto.aggregationDto.aggre;

@Value
public class RecommandStatusDto {
    private String UserId;
    private String recommandStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setRecommandStatus(ValueObjectFactory.newInstance(RecommandStatus.class, this.recommandStatus));
    }
}
