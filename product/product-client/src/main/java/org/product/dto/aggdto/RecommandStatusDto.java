package org.product.dto.aggdto;

@Data
public class RecommandStatusDto {
    private String ProductId;
    private String recommandStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setRecommandStatus(ValueObjectFactory.newInstance(RecommandStatus.class, this.recommandStatus));
    }
}
