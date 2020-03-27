package org.product.executor.command.aggre.brand;

import lombok.Value;

@Value
public class LetterCommand extends AbstractBrandCommand{
private org.product.dto.aggre.brand.LetterDto LetterDto;
}
