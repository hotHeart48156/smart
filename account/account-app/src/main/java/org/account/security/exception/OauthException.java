package org.account.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author "yangbiao"
 * @create 2019122322:29
 */
@JsonSerialize
public class OauthException extends OAuth2Exception {
    public OauthException(String meg) {
        super(meg);
    }
}
