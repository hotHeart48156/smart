package org.product.dto.entityDto.dto;

@Data
public class ProductFullReductionDto {
    private String id;
    private String productId;
    private String fullPrice;
    private String reducePrice;

    public void accept(ProductFullReduction productfullreduction) {
        productfullreduction.setId(ValueObjectFactory.newInstance(Id.class, id));
        productfullreduction.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productfullreduction.setFullPrice(ValueObjectFactory.newInstance(FullPrice.class, fullPrice));
        productfullreduction.setReducePrice(ValueObjectFactory.newInstance(ReducePrice.class, reducePrice));
    }
}
