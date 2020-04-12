package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name = "gifts")

public class Gifts implements org.product.domain.entity.Entity{
    @EmbeddedId
    private Id id;
}
