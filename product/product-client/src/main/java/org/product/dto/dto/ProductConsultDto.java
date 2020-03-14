package org.product.dto.dto;

@Data
public class ProductConsultDto {
    private String id;
    private String productId;
    private String productName;
    private String memberId;
    private String memberName;

    public void accept(ProductConsult productconsult) {
        productconsult.setId(ValueObjectFactory.newInstance(Id.class, id));
        productconsult.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productconsult.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        productconsult.setUserId(ValueObjectFactory.newInstance(UserId.class, memberId));
        productconsult.setMemberName(ValueObjectFactory.newInstance(MemberName.class, memberName));
    }
}
