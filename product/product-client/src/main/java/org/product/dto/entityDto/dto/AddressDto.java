package org.product.dto.entityDto.dto;

@Data
public class AddressDto {
    private String id;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

    public void accept(Address address) {
        address.setId(ValueObjectFactory.newInstance(Id.class, id));
        address.setProvince(ValueObjectFactory.newInstance(Province.class, province));
        address.setCity(ValueObjectFactory.newInstance(City.class, city));
        address.setRegion(ValueObjectFactory.newInstance(Region.class, region));
        address.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detailAddress));
    }
}
