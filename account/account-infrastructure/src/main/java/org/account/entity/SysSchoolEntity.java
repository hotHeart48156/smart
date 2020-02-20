package org.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_school", schema = "account", catalog = "")
public class SysSchoolEntity {
    private long id;
    private String longitude;
    private String latitude;
    private String name;
    private String province;
    private String city;
    private String region;
    private String address;
    private Integer hot;
    private Integer is211;
    private Integer is985;
    private Integer storeId;
    private String pic;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "longitude", nullable = true, length = 40)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, length = 40)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 20)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "region", nullable = true, length = 20)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "hot", nullable = true)
    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Basic
    @Column(name = "is211", nullable = true)
    public Integer getIs211() {
        return is211;
    }

    public void setIs211(Integer is211) {
        this.is211 = is211;
    }

    @Basic
    @Column(name = "is985", nullable = true)
    public Integer getIs985() {
        return is985;
    }

    public void setIs985(Integer is985) {
        this.is985 = is985;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysSchoolEntity that = (SysSchoolEntity) o;

        if (id != that.id) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (hot != null ? !hot.equals(that.hot) : that.hot != null) return false;
        if (is211 != null ? !is211.equals(that.is211) : that.is211 != null) return false;
        if (is985 != null ? !is985.equals(that.is985) : that.is985 != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (is211 != null ? is211.hashCode() : 0);
        result = 31 * result + (is985 != null ? is985.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        return result;
    }
}
