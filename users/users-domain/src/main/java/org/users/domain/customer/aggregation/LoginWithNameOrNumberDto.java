package org.users.domain.customer.aggregation;

import lombok.Data;

/**
 * @author "yangbiao"
 */
@Data
public class LoginWithNameOrNumberDto {
    private String nameOrTelephone;
    private String password;
}
