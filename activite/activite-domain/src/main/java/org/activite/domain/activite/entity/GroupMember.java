package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.id.GroupId;
import org.activite.domain.activite.valueobject.id.ProductId;
import org.activite.domain.activite.valueobject.id.UserId;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.ExpireTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class GroupMember {
    @EmbeddedId
private  GroupId groupId;
    @Embedded
private  UserId userId;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  ExpireTime expireTime;
    @Embedded
private  ProductId productId;

}
