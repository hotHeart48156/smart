package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.NoteDto;

@Value
public class NoteCommand  extends AbstractCommand{
private NoteDto  NoteDto;
}
