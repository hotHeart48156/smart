package org.product.executor.command.aggre.brand;

import lombok.Value;

import org.springframework.stereotype.Component;

@Value
@Component
public class LetterCommand extends AbstractBrandCommand{
private org.product.dto.aggre.brand.LetterDto LetterDto;
}
