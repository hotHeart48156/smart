import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication(scanBasePackages = "com.smart.website")
public class RepositoryTest  {
    @Autowired
    UserRepository repository;
    @Test
    public void test(){
        Id id=new Id();
        id.setId(23453546l);
        Name name=new Name();
        name.setName("fafafa");
        Telephone telephone=new Telephone();
        telephone.setTelephone(12454645654l);
        User user=new User();
       user.setId(id);
       user.setName(name);
       user.setTelephone(telephone);
        repository.save(user);
    }
}
