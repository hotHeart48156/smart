package org.users.domain.customer.aggregation;

import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.users.domain.customer.entity.*;
import org.users.domain.customer.valueobject.*;
import org.users.domain.customer.valueobject.icon.UserIcon;
import org.users.domain.customer.valueobject.id.*;
import org.users.domain.customer.valueobject.integration.Integration;
import org.users.domain.customer.valueobject.name.AreaName;
import org.users.domain.customer.valueobject.name.GoodsName;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.domain.customer.valueobject.name.UserName;
import org.users.domain.customer.valueobject.status.UserStatus;
import org.users.domain.customer.valueobject.type.CollectType;
import org.users.domain.customer.valueobject.type.SourceType;
import org.users.domain.customer.valueobject.user.Birthday;
import org.users.domain.customer.valueobject.user.Gender;
import org.users.domain.customer.valueobject.user.Job;
import org.users.domain.customer.valueobject.user.Password;

import javax.persistence.Access;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
public class User extends JpaAggregate {
    @NotNull
    private UserId userId;
    @NotNull
    private UserName userName;
    @NotNull
    private List<MemberLevelId> memberLevelIds;
    private List<AddressId> addressIds;
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
    private SourceType sourceType;
    private Integration integration;
    private Growth growth;
    private WeixinOpenId weixinOpenId;
    @NotNull
    private CreateTime createTime;
    private List<Id> growthChangeHistoryIds;
    private MemberLevelId memberLevelId;
    private List<Id> integrationChangeHistoryIds;
    private Id memberStatisticsInfoId;
    private List<Id> userCollectIds;

    public static User create(CreateUserDto userDto) {
        User user = new User();
        userDto.accept(user);
        return user;
    }

    public static User update(UserUpdateDto userUpdateDto) {
        User user = new User();

    }

    public void disable() {
        this.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, UserStatus.ENABLE.getClass()));
    }

    public void enable() {
        this.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, UserStatus.DISABLE.getClass()));

    }

    public static User changeMemberLevel() {
    }

    public static Boolean checkUsernameAndPassword() {
    }

    public static Boolean checkOpenid() {
    }

}
