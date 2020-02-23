package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.id.TagId;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public class UserAndTagRelationship {
    private UserId userId;
    private TagId tagId;
    private CreateTime createTime;

}
