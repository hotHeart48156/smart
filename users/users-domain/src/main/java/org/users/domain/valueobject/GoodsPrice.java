package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class GoodsPrice implements ValueObject {
    @Column(name ="   goodsPrice")
private String picUrl;
}
