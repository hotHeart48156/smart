package org.users.security.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author "yangbiao"
 * @create 2019122322:33
 */
public class WebResponseExceptionTranslator implements org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator {
    @Override
    public ResponseEntity translate(Exception e) throws Exception {
        OAuth2Exception oAuth2Exception = (OAuth2Exception) e;
        return ResponseEntity.status(oAuth2Exception.getHttpErrorCode())
                .body(new OauthException(oAuth2Exception.getMessage()));

    }
}
