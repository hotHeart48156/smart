package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.MemberPriceDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class MemberPriceCommand  extends AbstractProductCommand {
private MemberPriceDto memberPriceDto;
}
