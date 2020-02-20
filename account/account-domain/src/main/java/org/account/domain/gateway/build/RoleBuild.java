package org.account.domain.gateway.build;

import org.account.domain.account.entity.Role;

/**
 * @author "yangbiao"
 */
public interface RoleBuild {
    public Role toRole(Object roleDo);

}
