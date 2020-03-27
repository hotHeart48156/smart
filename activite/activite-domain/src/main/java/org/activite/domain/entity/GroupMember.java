package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.id.GroupId;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.ExpireTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name  ="smart.group_member")

public class GroupMember extends Entity {
    @EmbeddedId
private GroupId groupId;
    @Embedded
private UserId userId;
    @Embedded
private CreateTime createTime;
    @Embedded
private ExpireTime expireTime;
    @Embedded
private ProductId productId;

}
