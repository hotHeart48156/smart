package org.activite.domain.valueobject;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */

public class Phone implements ValueObject {
    @Column(name = "phone")
    String phone;
}
