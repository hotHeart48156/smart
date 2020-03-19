package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.RecommendSubject;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.SubjectId;
import org.activite.domain.valueobject.name.SubjectName;
import org.activite.domain.valueobject.status.RecommendStatus;

@Data
public class RecommendSubjectDto {
    private String subjectId;
    private String subjectName;
    private String recommendStatus;

    public void accept(RecommendSubject recommendsubject) {
        recommendsubject.setSubjectId(ValueObjectFactory.newInstance(SubjectId.class, subjectId));
        recommendsubject.setSubjectName(ValueObjectFactory.newInstance(SubjectName.class, subjectName));
        recommendsubject.setRecommendStatus(ValueObjectFactory.newInstance(RecommendStatus.class, recommendStatus));
    }
}
