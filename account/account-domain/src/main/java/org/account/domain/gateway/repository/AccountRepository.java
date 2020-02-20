package org.account.domain.gateway.repository;

import org.account.domain.account.aggregate.Account;
import org.account.domain.account.entity.User;
import org.account.domain.account.valueobj.user.UserId;

/**
 * @author "yangbiao"
 */
public interface AccountRepository {
    public Account getAccountByUserId(UserId userId);

}
