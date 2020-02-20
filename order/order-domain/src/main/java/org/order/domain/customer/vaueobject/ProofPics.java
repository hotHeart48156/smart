package org.order.domain.customer.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class ProofPics implements ValueObject {
    @Column(name = "proof_pics_url")
    private String proofPicsUrl;
}
