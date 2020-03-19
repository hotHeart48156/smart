package org.activite.domain.valueobject.id;

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
public class SubjectId extends AbstractId
{
@Column(name ="   subjectId")
private  Long   subjectId;
}
