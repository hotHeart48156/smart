import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.users.domain.repository.MemberLevelRepository;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.MemberLevelId;

/**
 * @author "yangbiao"
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class Repotest {
    @Autowired
    MemberLevelRepository repository;
    @Test
    public void test(){

       System.out.println( repository.findById(ValueObjectFactory.newInstance(MemberLevelId.class,"23435453423")));
    }

}
