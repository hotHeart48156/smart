package org.users.domainevent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEvent {
    private Long eventIdentifier;
    private String aggregateIdentifier;
    private String type;
    private Long sequenceNumber;

    public String getType() {
        return type;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }
}
