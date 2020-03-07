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
public class NickName extends AbstractName {
    @Column(name ="   nickName")
private String name;

}
