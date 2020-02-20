package org.account.domain.account.valueobj.permission;

import org.account.domain.account.valueobj.ValueObjectFactory;
import org.account.domain.account.valueobj.permission.AbstructPermission;

/**
 * @author "yangbiao"
 */
public class PermissionFactory implements ValueObjectFactory {
    public static <T extends AbstructPermission> T createPermissionObject(Class<T> c, Object value) {
        AbstructPermission abstructPermission = null;
        try {
            abstructPermission = (AbstructPermission) Class.forName(c.getName()).getConstructor().newInstance(value);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return (T) abstructPermission;
    }
}
