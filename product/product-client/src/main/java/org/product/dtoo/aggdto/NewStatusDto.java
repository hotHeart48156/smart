package org.product.dtoo.aggdto;

@Data
public class NewStatusDto {
    private String ProductId;
    private String newStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setNewStatus(ValueObjectFactory.newInstance(NewStatus.class, this.newStatus));
    }
}
