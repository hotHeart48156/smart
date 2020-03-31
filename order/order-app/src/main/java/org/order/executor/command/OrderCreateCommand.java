package org.order.executor.command;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.kie.api.definition.rule.All;
import org.order.dto.OrderCreateDto;

@Value
@AllArgsConstructor
public class OrderCreateCommand  extends AbstractCommand{
private OrderCreateDto  OrderCreateDto;
}
