package org.product.dto.aggregationDto.aggre;

@Value
public class TitleDto {
    private String UserId;
    private String title;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setTitle(ValueObjectFactory.newInstance(Title.class, this.title));
    }
}
