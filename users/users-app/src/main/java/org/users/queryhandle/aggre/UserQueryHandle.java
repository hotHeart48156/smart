package  org.users.queryhandle.aggre;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class UserQueryHandle{
    @QueryHandler
public List<User>query(UserQuery query){


}}
