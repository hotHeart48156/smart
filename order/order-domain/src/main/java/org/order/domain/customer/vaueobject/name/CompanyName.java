package org.order.domain.customer.vaueobject.name;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class CompanyName extends AbstractName {
    @Column(name = "company_name")
    private String companyName;
}
