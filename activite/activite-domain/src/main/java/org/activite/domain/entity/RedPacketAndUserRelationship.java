package org.activite.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.activite.domain.valueobject.amount.RedPacketAmount;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.RedPacketId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.name.UserName;
import org.activite.domain.valueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class RedPacketAndUserRelationship extends AbstractEntity{
 @EmbeddedId
private Id id;
 @Embedded
private UserId sendRedPacketUserId;
 @Embedded
private UserId userId;
 @Embedded
private RedPacketId redPacketId;
 @Embedded
private UserName userName;
 @Embedded
private RedPacketAmount redPacketAmount;
 @Embedded
private CreateTime createTime;
}
