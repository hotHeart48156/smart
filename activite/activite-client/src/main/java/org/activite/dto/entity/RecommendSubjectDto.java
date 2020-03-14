package org.activite.dto.entity;

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
