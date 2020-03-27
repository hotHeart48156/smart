package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
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

@Data
public class GroupDto   extends AbstractEntityDto{
    private String groupId;
    private String productId;
    private String productName;
    private String productPrice;
    private String groupPrice;
    private String startTime;
    private String endTime;
    private String coutinueTime;
    private String groupPeopleCount;
    private String groupStatus;
    private String groupPeopleMaxCount;
    private String createTime;

    public void accept(Group group) {
        group.setGroupId(ValueObjectFactory.newInstance(GroupId.class, groupId));
        group.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        group.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        group.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, productPrice));
        group.setGroupPrice(ValueObjectFactory.newInstance(GroupPrice.class, groupPrice));
        group.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        group.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        group.setCoutinueTime(ValueObjectFactory.newInstance(CoutinueTime.class, coutinueTime));
        group.setGroupPeopleCount(ValueObjectFactory.newInstance(GroupPeopleCount.class, groupPeopleCount));
        group.setGroupStatus(ValueObjectFactory.newInstance(GroupStatus.class, groupStatus));
        group.setGroupPeopleMaxCount(ValueObjectFactory.newInstance(GroupPeopleMaxCount.class, groupPeopleMaxCount));
        group.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
