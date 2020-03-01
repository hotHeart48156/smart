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
import org.users.domain.customer.valueobject.id.WeixinOpenId;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
@ProcessingGroup("user")
public class FindUserByOpenidEventHandle extends AbstractEventHandle {
    @Autowired
    private UserRepository repository;
    @Autowired
    private CacheChannel cacheChannel;

    private Gson gson = new Gson();

    @QueryHandler
    public User on(String openid) {
        if (cacheChannel.exists("user", openid)) {
            return gson.fromJson(cacheChannel.get("user", openid).asString(), User.class);
        } else {
            return repository.findById(ValueObjectFactory.newInstance(WeixinOpenId.class, openid.getClass())).get();
        }
    }
}
