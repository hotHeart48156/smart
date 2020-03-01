package org.users.executor.query;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.apache.kafka.common.protocol.types.Field;
import org.users.executor.AbstractQuery;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class QueryUserByUsername extends AbstractQuery {
    private String username;
}
