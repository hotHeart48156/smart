package org.users.domain.aggregation;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.jetbrains.annotations.NotNull;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.PhoneNumber;
import org.users.domain.valueobject.icon.UserIcon;
import org.users.domain.valueobject.id.*;
import org.users.domain.valueobject.integration.Integration;
import org.users.domain.valueobject.name.NickName;
import org.users.domain.valueobject.name.UserName;
import org.users.domain.valueobject.status.UserStatus;
import org.users.domain.valueobject.type.SourceType;
import org.users.domain.valueobject.user.Birthday;
import org.users.domain.valueobject.user.Gender;
import org.users.domain.valueobject.user.Job;
import org.users.domain.valueobject.user.Password;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
@Aggregate(repository = "UserRepository")
public class User implements Aggregation {
    @NotNull
    @TargetAggregateIdentifier
     @EmbeddedId
private UserId userId;
    @NotNull
     @Embedded
private UserName userName;
  @NotNull
   @Embedded
private MemberLevelId memberLevelId;

     @Embedded
    private String appletSetId;
    @NotNull
    @Embedded
private Password password;
    @NotNull
     @Embedded
private NickName nickName;
    @NotNull
     @Embedded
private PhoneNumber phoneNumber;
    @NotNull
     @Embedded
private UserStatus userStatus;
     @Embedded
private UserIcon userIcon;
    @NotNull
     @Embedded
private Gender gender;
    @NotNull
     @Embedded
private Birthday birthday;
     @Embedded
private Job job;
     @Embedded
private SourceType sourceType;
     @Embedded
private Integration integration;
     @Embedded
private Growth growth;
     @Embedded
private WeixinOpenId weixinOpenId;
    @NotNull
     @Embedded
private CreateTime createTime;
  
private IntegrationConsumeSettingId integrationConsumeSettingId;
     @Embedded
private Id memberStatisticsInfoId;

   


}
