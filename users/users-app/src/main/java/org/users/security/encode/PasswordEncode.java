package org.users.security.encode;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author "yangbiao"
 * @create 2019122317:50
 */
public class PasswordEncode implements Encode {
    @Override
    public PasswordEncoder encoder(int pass) {
        return new BCryptPasswordEncoder(pass);
    }

    @Override
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
