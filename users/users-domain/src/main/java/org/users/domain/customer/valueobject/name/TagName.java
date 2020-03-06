package org.users.domain.customer.valueobject.name;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class TagName extends AbstractName {
   @Column(name ="   tagName")
private String name;
}
