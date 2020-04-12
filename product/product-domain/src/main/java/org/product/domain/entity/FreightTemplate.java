package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.fee.CountFee;
import org.product.domain.valueobject.id.FeightTemplateId;
import org.product.domain.valueobject.type.ChargeType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Data
@javax.persistence.Entity
@Table(name = "FreightTemplate")

public class FreightTemplate    implements  Entity{
     @EmbeddedId
    private FeightTemplateId feightTemplateId;
     @Embedded
    private ChargeType chargeType;
     @Embedded
    private CountFee countFee;

}
