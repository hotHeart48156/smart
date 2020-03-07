package org.users.domain.valueobject.id;

import lombok.*;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
@AllArgsConstructor
public class AreaId extends AbstractId {
    @Column(name ="   areaId")
    @NonNull
private String id;


    public AreaId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }



}
