package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.type.SourceType;

@Data
public class SourceTypeDto {
    private String UserId;
    private String sourceType;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setSourceType(ValueObjectFactory.newInstance(SourceType.class, this.sourceType));
    }
}
