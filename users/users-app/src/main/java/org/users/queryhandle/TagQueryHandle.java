package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.Tag;
import org.users.executor.query.entity.TagQuery;

import java.util.List;
public class TagQueryHandle{
    @QueryHandler
public List<Tag>query(TagQuery query){


}}
