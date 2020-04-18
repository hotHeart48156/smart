package org.product.executor.command.aggre.brand;

import lombok.Value;

import org.springframework.stereotype.Component;

@Value
@Component
public class BrandStoryCommand extends AbstractBrandCommand{
private org.product.dto.aggre.brand.BrandStoryDto BrandStoryDto;
}
