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

/**
 * @author "yangbiao"
 */
public class HomeAdvertise {
    private HomeAdvertiseId homeAdvertiseId;
    private HomeAdvertiseName homeAdvertiseName;
    private HomeAdvertiseType homeAdvertiseType;
    private Pic pic;
    private StartTime startTime;
    private EndTime endTime;
    private HomeAdvertiseStatus homeAdvertiseStatus;
    private HomeAdvertiseClickCount homeAdvertiseClickCount;
    private HomeAdvertiseOrderCount homeAdvertiseOrderCount;
    private Url url;
    private Note note;

}
