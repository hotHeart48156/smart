package org.product.dto.dto;

@Data
public class MemberPriceDto {
    private String memberPriceId;
    private String productId;
    private String memberlLevel;
    private String memberPrice;

    public void accept(MemberPrice memberprice) {
        memberprice.setMemberPriceId(ValueObjectFactory.newInstance(MemberPriceId.class, memberPriceId));
        memberprice.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        memberprice.setMemberlLevel(ValueObjectFactory.newInstance(MemberlLevel.class, memberlLevel));
        memberprice.setMemberPrice(ValueObjectFactory.newInstance(MemberPrice.class, memberPrice));
    }
}
