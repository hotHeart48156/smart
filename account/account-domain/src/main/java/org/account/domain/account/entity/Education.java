package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.education.*;

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
