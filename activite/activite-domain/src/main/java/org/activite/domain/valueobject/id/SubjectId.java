package org.activite.domain.valueobject.id;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class SubjectId extends AbstractId
{
@Column(name ="   subjectId")
private  Long   subjectId;
}
