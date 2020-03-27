package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.PhoneNumberDto;

@Value
public class PhoneNumberCommand  extends AbstractCommand{
private PhoneNumberDto  PhoneNumberDto;
}
