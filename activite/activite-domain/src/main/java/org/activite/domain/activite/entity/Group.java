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

/**
 * @author "yangbiao"
 */
public class Group {
    private GroupId groupId;
    private ProductId productId;
    private ProductName productName;
    private ProductPrice productPrice;
    private GroupPrice groupPrice;
    private StartTime startTime;
    private EndTime endTime;
    private CoutinueTime coutinueTime;
    private GroupPeopleCount groupPeopleCount;
    private GroupStatus groupStatus;
    private GroupPeopleMaxCount groupPeopleMaxCount;
    private CreateTime createTime;
}
