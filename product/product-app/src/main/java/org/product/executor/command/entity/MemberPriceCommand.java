package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.MemberPriceDto;
import org.product.executor.AbstractCommand;
@Value
public class MemberPriceCommand  extends AbstractCommand{
private MemberPriceDto  MemberPriceDto;
}
