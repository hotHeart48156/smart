package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.count.GroupPeopleCount;
import org.activite.domain.activite.valueobject.count.GroupPeopleMaxCount;
import org.activite.domain.activite.valueobject.id.GoodsId;
import org.activite.domain.activite.valueobject.id.GroupId;
import org.activite.domain.activite.valueobject.id.ProductId;
import org.activite.domain.activite.valueobject.name.ProductName;
import org.activite.domain.activite.valueobject.price.GroupPrice;
import org.activite.domain.activite.valueobject.price.ProductPrice;
import org.activite.domain.activite.valueobject.status.GroupStatus;
import org.activite.domain.activite.valueobject.time.CoutinueTime;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class Group {
    @EmbeddedId
private  GroupId groupId;
    @Embedded
private  ProductId productId;
    @Embedded
private  ProductName productName;
    @Embedded
private  ProductPrice productPrice;
    @Embedded
private  GroupPrice groupPrice;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  CoutinueTime coutinueTime;
    @Embedded
private  GroupPeopleCount groupPeopleCount;
    @Embedded
private  GroupStatus groupStatus;
    @Embedded
private  GroupPeopleMaxCount groupPeopleMaxCount;
    @Embedded
private  CreateTime createTime;
}
