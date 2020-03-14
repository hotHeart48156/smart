package org.users.domain.dto.agg;

@Data
public class SourceTypeDto {
    private String UserId;
    private String sourceType;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setSourceType(ValueObjectFactory.newInstance(SourceType.class, this.sourceType));
    }
}
