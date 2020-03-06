package org.product.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Value;

import lombok.Value;

import javax.persistence.Embeddable;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class CollectCount implements ValueObject
{
private String   collectCount;
}
