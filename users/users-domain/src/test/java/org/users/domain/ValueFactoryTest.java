package org.users.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.UserName;

/**
 * @author yangbiao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueFactoryTest {
    @Test
    public void testValueFactory(){
        UserName name= ValueObjectFactory.newInstance(UserName.class,"popo".getClass());
        System.out.println(name.getName());

    }
}
