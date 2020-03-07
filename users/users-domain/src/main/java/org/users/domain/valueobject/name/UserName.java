package org.users.domain.valueobject.name;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
public class UserName extends AbstractName {
    @Column(name ="   userName")
private String name;

}
