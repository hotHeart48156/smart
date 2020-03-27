package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.id.SubjectId;
import org.activite.domain.valueobject.name.SubjectName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Data
@javax.persistence.Entity
@Table(name  ="smart.recommand_subject")

public class RecommendSubject extends Entity {
    @EmbeddedId
private SubjectId subjectId;
    @Embedded
private SubjectName subjectName;
    @Embedded
private RecommendStatus recommendStatus;

}
