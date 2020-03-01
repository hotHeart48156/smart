package org.users.security.encode;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "yangbiao"
 * @date 2019122310:39
 */
public class DelegatingPasswordEncoder implements Encode {
    String idForEncode = "bcrypt";

    @Override
    public PasswordEncoder encoder(int password) {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put(idForEncode, new BCryptPasswordEncoder());
        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());


        return new org.springframework.security.crypto.password.DelegatingPasswordEncoder(idForEncode, encoders);
    }

    @Override
    public PasswordEncoder encoder() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put(idForEncode, new BCryptPasswordEncoder());
        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());


        return new org.springframework.security.crypto.password.DelegatingPasswordEncoder(idForEncode, encoders);
    }
}
