package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.id.EducationId;

import java.awt.*;
/**
 * @author "yangbiao"
 */
@Data
public class Education {
    private Position position;
    private Image image;
    private Level level;
    private Address address;
    private EducationId id;
}
