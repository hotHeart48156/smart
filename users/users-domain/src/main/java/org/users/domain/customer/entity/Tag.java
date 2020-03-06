package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.entity.Entity;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.name.TagName;
import org.users.domain.customer.valueobject.type.TagType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class Tag implements Entity {
    @EmbeddedId
private  Id id;
    @Embedded
private  TagName tagName;
    @Embedded
private  TagType tagType;
    @Embedded
private  CreateTime createTime;
}
