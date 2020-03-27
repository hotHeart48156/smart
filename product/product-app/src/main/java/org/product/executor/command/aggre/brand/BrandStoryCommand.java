package org.product.executor.command.aggre.brand;

import lombok.Value;

@Value
public class BrandStoryCommand extends AbstractBrandCommand{
private org.product.dto.aggre.brand.BrandStoryDto BrandStoryDto;
}
