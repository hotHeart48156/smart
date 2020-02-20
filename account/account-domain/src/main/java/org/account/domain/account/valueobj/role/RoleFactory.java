package org.account.domain.account.valueobj.role;

import org.account.domain.account.valueobj.ValueObjectFactory;
import org.account.domain.account.valueobj.role.AbstructRole;

/**
 * @author "yangbiao"
 */
public class RoleFactory implements ValueObjectFactory {
    public <T extends AbstructRole> T createRoleObject(Class<T> c, Object value) {
        AbstructRole abstructRole = null;
        try {
            abstructRole = (AbstructRole) Class.forName(c.getName()).getConstructor().newInstance(value);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return (T) abstructRole;
    }
}
