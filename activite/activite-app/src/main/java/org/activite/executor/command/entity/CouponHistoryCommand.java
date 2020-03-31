package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.CouponHistoryDto;
@Value
@AllArgsConstructor
public class CouponHistoryCommand  extends AbstractEntityCommand{
private CouponHistoryDto  CouponHistoryDto;
}
