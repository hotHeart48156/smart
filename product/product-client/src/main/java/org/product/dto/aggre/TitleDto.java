package org.product.dto.aggre;

@Data
public class TitleDto {
    private String ProductId;
    private String title;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setTitle(ValueObjectFactory.newInstance(Title.class, this.title));
    }
}
