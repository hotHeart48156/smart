package com.smart.website;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Data
public class Telephone {
@Column(name = "telephone")
    private Long  telephone;
}
