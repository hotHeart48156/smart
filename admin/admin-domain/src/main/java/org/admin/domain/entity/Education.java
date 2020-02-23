package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.EducationId;

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
