package org.product.dtoo.aggdto;

@Data
public class PublishStatusDto {
    private String ProductId;
    private String publishStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setPublishStatus(ValueObjectFactory.newInstance(PublishStatus.class, this.publishStatus));
    }
}
