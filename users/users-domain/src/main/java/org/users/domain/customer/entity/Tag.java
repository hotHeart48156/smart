package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.entity.Entity;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.name.TagName;
import org.users.domain.customer.valueobject.type.TagType;

/**
 * @author "yangbiao"
 */
@Data
public class Tag implements Entity {
    private Id id;
    private TagName tagName;
    private TagType tagType;
    private CreateTime createTime;
}
