package org.users.eventhandler;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import net.oschina.j2cache.CacheChannel;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.repository.UserRepository;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.name.UserName;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
@ProcessingGroup("user")
public class FindUserByUsernameEventHandle extends AbstractEventHandle {
    @Autowired
    private UserRepository repository;
    @Autowired
    private CacheChannel cacheChannel;

    private Gson gson = new Gson();

    @QueryHandler
    public User on(String username) {
        if (cacheChannel.exists("user", username)) {
            return gson.fromJson(cacheChannel.get("user", username).asString(), User.class);
        } else {
            return repository.findById(ValueObjectFactory.newInstance(UserName.class, username.getClass())).get();
        }
    }
}
