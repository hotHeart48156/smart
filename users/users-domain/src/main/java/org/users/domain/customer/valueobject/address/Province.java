package org.users.domain.customer.valueobject.address;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Embeddable

public class Province extends AbstractAddress {
    @Column(name ="   province")

    private String province;

}
