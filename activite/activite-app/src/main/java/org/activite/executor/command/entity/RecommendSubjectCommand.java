package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.RecommendSubjectDto;
@Value
@AllArgsConstructor

public class RecommendSubjectCommand  extends AbstractEntityCommand{
private RecommendSubjectDto  RecommendSubjectDto;
}
