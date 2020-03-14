package org.activite.dto.agg;

@Data
public class UserIdDto {
    private String ActiviteId;
    private String userId;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setUserId(ValueObjectFactory.newInstance(UserId.class, this.userId));
    }
}
