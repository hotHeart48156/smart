package org.product.dto.dto;

@Data
public class ProductVerifyRecordDto {
    private String id;
    private String productId;
    private String createTime;
    private String verifyMan;
    private String detail;

    public void accept(ProductVerifyRecord productverifyrecord) {
        productverifyrecord.setId(ValueObjectFactory.newInstance(Id.class, id));
        productverifyrecord.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productverifyrecord.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        productverifyrecord.setVerifyMan(ValueObjectFactory.newInstance(VerifyMan.class, verifyMan));
        productverifyrecord.setDetail(ValueObjectFactory.newInstance(Detail.class, detail));
    }
}
