package org.product.dto.aggregationDto.aggre;

@Value
public class LetterDto {
    private String UserId;
    private String firstLetter;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setLetter(ValueObjectFactory.newInstance(Letter.class, this.firstLetter));
    }
}
