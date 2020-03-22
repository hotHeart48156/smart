package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.AppletSet;
import org.users.executor.query.entity.AppletSetQuery;

import java.util.List;
public class AppletSetQueryHandle{
    @QueryHandler
public List<AppletSet>query(AppletSetQuery query){


}}
