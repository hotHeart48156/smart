package org.product.dtoo.dto;

@Data
public class GiftsDto {
    private String id;

    public void accept(Gifts gifts) {
        gifts.setId(ValueObjectFactory.newInstance(Id.class, id));
    }
}
