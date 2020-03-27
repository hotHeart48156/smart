package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.HomeAdvertise;
import org.activite.domain.valueobject.Pic;
import org.activite.domain.valueobject.Url;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.HomeAdvertiseClickCount;
import org.activite.domain.valueobject.count.HomeAdvertiseOrderCount;
import org.activite.domain.valueobject.id.HomeAdvertiseId;
import org.activite.domain.valueobject.name.HomeAdvertiseName;
import org.activite.domain.valueobject.status.HomeAdvertiseStatus;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.HomeAdvertiseType;

@Data
public class HomeAdvertiseDto   extends AbstractEntityDto{
    private String homeAdvertiseId;
    private String homeAdvertiseName;
    private String homeAdvertiseType;
    private String pic;
    private String startTime;
    private String endTime;
    private String homeAdvertiseStatus;
    private String homeAdvertiseClickCount;
    private String homeAdvertiseOrderCount;
    private String url;
    private String note;

    public void accept(HomeAdvertise homeadvertise) {
        homeadvertise.setHomeAdvertiseId(ValueObjectFactory.newInstance(HomeAdvertiseId.class, homeAdvertiseId));
        homeadvertise.setHomeAdvertiseName(ValueObjectFactory.newInstance(HomeAdvertiseName.class, homeAdvertiseName));
        homeadvertise.setHomeAdvertiseType(ValueObjectFactory.newInstance(HomeAdvertiseType.class, homeAdvertiseType));
        homeadvertise.setPic(ValueObjectFactory.newInstance(Pic.class, pic));
        homeadvertise.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        homeadvertise.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        homeadvertise.setHomeAdvertiseStatus(ValueObjectFactory.newInstance(HomeAdvertiseStatus.class, homeAdvertiseStatus));
        homeadvertise.setHomeAdvertiseClickCount(ValueObjectFactory.newInstance(HomeAdvertiseClickCount.class, homeAdvertiseClickCount));
        homeadvertise.setHomeAdvertiseOrderCount(ValueObjectFactory.newInstance(HomeAdvertiseOrderCount.class, homeAdvertiseOrderCount));
        homeadvertise.setUrl(ValueObjectFactory.newInstance(Url.class, url));
        homeadvertise.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
