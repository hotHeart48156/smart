package org.users.domainevent;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class FindUserByOpenidEvent extends AbstractEvent {
    String openid;
}
