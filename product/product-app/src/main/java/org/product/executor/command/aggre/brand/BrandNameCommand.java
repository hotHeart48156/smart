package org.product.executor.command.aggre.brand;

import lombok.Value;

@Value
public class BrandNameCommand extends AbstractBrandCommand{
private org.product.dto.aggre.brand.BrandNameDto BrandNameDto;
}
