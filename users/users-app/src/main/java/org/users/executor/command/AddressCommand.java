package org.users.executor.command;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.graalvm.compiler.api.replacements.Snippet;
import org.users.dto.AddressDto;
@EqualsAndHashCode(callSuper = true)
@Value
public class AddressCommand  extends AbstractCommand
{
    private AddressDto addressDto;
}