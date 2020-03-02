package org.users.domain.customer.aggregation;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.icon.UserIcon;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.domain.customer.valueobject.name.UserName;
import org.users.domain.customer.valueobject.status.UserStatus;
import org.users.domain.customer.valueobject.user.Birthday;
import org.users.domain.customer.valueobject.user.Gender;
import org.users.domain.customer.valueobject.user.Job;
import org.users.domain.customer.valueobject.user.Password;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */

public class BusinessUser {
    @NotNull
    @TargetAggregateIdentifier
    private UserId userId;
    @NotNull
    private UserName userName;
    @NotNull
    private Password password;
    @NotNull
    private NickName nickName;
    @NotNull
    private PhoneNumber phoneNumber;
    @NotNull
    private UserStatus userStatus;
    private UserIcon userIcon;
    @NotNull
    private Gender gender;
    @NotNull
    private Birthday birthday;
    private Job job;
}
