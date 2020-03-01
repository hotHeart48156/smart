package org.users.executor.query;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractQuery;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class QueryUserByOpenid extends AbstractQuery {
    private String openid;
}
