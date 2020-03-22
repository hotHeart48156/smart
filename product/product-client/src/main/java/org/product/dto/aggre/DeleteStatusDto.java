package org.product.dto.aggre;

@Data
public class DeleteStatusDto {
    private String ProductId;
    private String deleteStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setDeleteStatus(ValueObjectFactory.newInstance(DeleteStatus.class, this.deleteStatus));
    }
}
