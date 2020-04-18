package org.product.domain.entity;

import org.product.domain.valueobject.id.GiftId;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Table(name = "giftCategory")

public class GiftsCategory implements org.product.domain.entity.Entity{
    @EmbeddedId
    private GiftId giftId;
}
