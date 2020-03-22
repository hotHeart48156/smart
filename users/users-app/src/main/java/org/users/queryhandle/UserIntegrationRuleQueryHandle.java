package  org.users.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class UserIntegrationRuleQueryHandle{
    @QueryHandler
public List<UserIntegrationRule>query(UserIntegrationRuleQuery query){


}}
