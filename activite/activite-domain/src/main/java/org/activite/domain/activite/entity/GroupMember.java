package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.id.GroupId;
import org.activite.domain.activite.valueobject.id.ProductId;
import org.activite.domain.activite.valueobject.id.UserId;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.ExpireTime;

/**
 * @author "yangbiao"
 */
public class GroupMember {
    private GroupId groupId;
    private UserId userId;
    private CreateTime createTime;
    private ExpireTime expireTime;
    private ProductId productId;

}
