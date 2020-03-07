package org.users.domain.valueobject.name;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
@Embeddable
public class AreaName extends AbstractName {
    @Column(name ="   areaName")
private String name;
}
