package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.id.SubjectId;
import org.activite.domain.activite.valueobject.name.SubjectName;
import org.activite.domain.activite.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class RecommendSubject {
    @EmbeddedId
private  SubjectId subjectId;
    @Embedded
private  SubjectName subjectName;
    @Embedded
private  RecommendStatus recommendStatus;

}
