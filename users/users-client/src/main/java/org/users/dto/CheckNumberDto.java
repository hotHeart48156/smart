package org.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CheckNumberDto extends AbstractDto {
    private String phone;
    private String password;
}
