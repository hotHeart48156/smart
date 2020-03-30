package org.activite.domain.valueobject.type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum ActiviteType implements Type
{
CATEGORY(1),PRODUCT(2);
@Column(name ="activiteType")
private  int   activiteType;


   ActiviteType(int type) {
        this.activiteType=type;
    }
    ActiviteType() {
    }

    public int getActiviteType() {
        return activiteType;
    }
}
