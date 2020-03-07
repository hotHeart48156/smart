package org.users.domain.entity;

import lombok.Data;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.TagName;
import org.users.domain.valueobject.type.TagType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class Tag implements Entity {
    @EmbeddedId
private Id id;
    private UserId userId;
    @Embedded
private TagName tagName;
    @Embedded
private TagType tagType;
    @Embedded
private CreateTime createTime;
}
