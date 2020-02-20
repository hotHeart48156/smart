package org.account.domain.account.valueobj.user;

import lombok.extern.slf4j.Slf4j;
import org.account.domain.account.valueobj.ValueObjectFactory;

/**
 * @author "yangbiao"
 */
@Slf4j
public class UserObjectFactory implements ValueObjectFactory {
    public static <T extends AbstructUser> T createUserObject(Class<T> c, Object value) {
        AbstructUser abstructUser = null;
        try {
            abstructUser = (AbstructUser) Class.forName(c.getName()).getConstructor().newInstance(value);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return (T) abstructUser;
    }
}
