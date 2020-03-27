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
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
@Data
@Table(name  ="smart.redpacket_and_user_relationship")

public class RedPacketAndUserRelationship extends Entity {
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
