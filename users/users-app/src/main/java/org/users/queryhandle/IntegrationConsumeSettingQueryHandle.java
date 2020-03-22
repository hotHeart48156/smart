package  org.users.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.executor.query.entity.IntegrationConsumeSettingQuery;

import java.util.List;
public class IntegrationConsumeSettingQueryHandle{
    @QueryHandler
public List<IntegrationConsumeSetting>query(IntegrationConsumeSettingQuery query){


}}
