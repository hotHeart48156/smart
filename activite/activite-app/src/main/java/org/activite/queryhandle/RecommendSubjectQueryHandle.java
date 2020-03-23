package  org.activite.queryhandle;

import org.activite.domain.entity.RecommendSubject;
import org.activite.executor.query.entity.RecommendSubjectQuery;
import org.axonframework.queryhandling.QueryHandler;

import java.util.List;
public class RecommendSubjectQueryHandle{
    @QueryHandler
public List<RecommendSubject>query(RecommendSubjectQuery query){


}}
