package com.smart.website;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Data
public class Id implements Serializable {
    @Column(name = "id")
private Long id;
}
