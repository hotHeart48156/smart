package org.product.dto.aggre;

@Data
public class PreviewStatusDto {
    private String ProductId;
    private String previewStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setPreviewStatus(ValueObjectFactory.newInstance(PreviewStatus.class, this.previewStatus));
    }
}
