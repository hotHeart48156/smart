package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.CouponHistoryDto;
@Value
public class CouponHistoryCommand  extends AbstractEntityCommand{
private CouponHistoryDto  CouponHistoryDto;
}
