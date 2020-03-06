package org.users.domain.customer.valueobject.icon;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
@AllArgsConstructor
public class UserIcon extends AbstractIcon {
    @Column(name = "userIcon")
    private String icon;
}
