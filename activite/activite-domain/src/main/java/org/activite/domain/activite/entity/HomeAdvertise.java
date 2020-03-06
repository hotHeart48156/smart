package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.Note;
import org.activite.domain.activite.valueobject.Pic;
import org.activite.domain.activite.valueobject.Url;
import org.activite.domain.activite.valueobject.count.HomeAdvertiseClickCount;
import org.activite.domain.activite.valueobject.count.HomeAdvertiseOrderCount;
import org.activite.domain.activite.valueobject.id.HomeAdvertiseId;
import org.activite.domain.activite.valueobject.name.HomeAdvertiseName;
import org.activite.domain.activite.valueobject.status.HomeAdvertiseStatus;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;
import org.activite.domain.activite.valueobject.type.HomeAdvertiseType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class HomeAdvertise {
    @EmbeddedId
private  HomeAdvertiseId homeAdvertiseId;
    @Embedded
private  HomeAdvertiseName homeAdvertiseName;
    @Embedded
private  HomeAdvertiseType homeAdvertiseType;
    @Embedded
private  Pic pic;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  HomeAdvertiseStatus homeAdvertiseStatus;
    @Embedded
private  HomeAdvertiseClickCount homeAdvertiseClickCount;
    @Embedded
private  HomeAdvertiseOrderCount homeAdvertiseOrderCount;
    @Embedded
private  Url url;
    @Embedded
private  Note note;

}
