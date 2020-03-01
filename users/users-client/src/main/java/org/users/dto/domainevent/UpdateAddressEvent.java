package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.entity.Address;
import org.users.domain.customer.valueobject.ValueObject;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.address.City;
import org.users.domain.customer.valueobject.address.DetailAddress;
import org.users.domain.customer.valueobject.address.Province;
import org.users.domain.customer.valueobject.address.Region;
import org.users.domain.customer.valueobject.id.AddressId;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.AddressDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdateAddressEvent extends AbstractEvent {
    AddressDto addressDto;

}
