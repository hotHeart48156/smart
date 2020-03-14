package org.activite.dto.entity;

@Data
public class HomeAdvertiseDto {
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
