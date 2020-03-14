package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.Tag;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.TagName;
import org.users.domain.valueobject.type.TagType;

@Data
public class TagDto {
    private String id;
    private String userId;
    private String tagName;
    private String tagType;
    private String createTime;

    public void accept(Tag tag) {
        tag.setId(ValueObjectFactory.newInstance(Id.class, id));
        tag.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        tag.setTagName(ValueObjectFactory.newInstance(TagName.class, tagName));
        tag.setTagType(ValueObjectFactory.newInstance(TagType.class, tagType));
        tag.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
