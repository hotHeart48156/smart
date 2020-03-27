package org.activite.domain.aggregation;

import lombok.Data;
import org.activite.domain.valueobject.count.GroupPeopleCount;
import org.activite.domain.valueobject.count.GroupPeopleMaxCount;
import org.activite.domain.valueobject.id.GroupId;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.price.GroupPrice;
import org.activite.domain.valueobject.price.ProductPrice;
import org.activite.domain.valueobject.status.GroupStatus;
import org.activite.domain.valueobject.time.CoutinueTime;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Group extends Aggregation {
    @EmbeddedId
private GroupId groupId;
    @Embedded
private ProductId productId;
    @Embedded
private ProductName productName;
    @Embedded
private ProductPrice productPrice;
    @Embedded
private GroupPrice groupPrice;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private CoutinueTime coutinueTime;
    @Embedded
private GroupPeopleCount groupPeopleCount;
    @Embedded
private GroupStatus groupStatus;
    @Embedded
private GroupPeopleMaxCount groupPeopleMaxCount;
    @Embedded
private CreateTime createTime;
}
