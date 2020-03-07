package org.users.domain;

import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.UserName;

/**
 * @author yangbiao
 */

public class test {
    public static void main(String[] args) {
        UserName name= ValueObjectFactory.newInstance(UserName.class,"popo");
        UserId id=new UserId("codmoaca");
        System.out.println(name.getName());
        System.out.println(name.getName());

        System.out.println(name.getName());

        System.out.println(id.getId());


    }
}
