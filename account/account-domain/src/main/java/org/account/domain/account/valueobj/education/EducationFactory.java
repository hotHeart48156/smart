package org.account.domain.account.valueobj.education;

import org.account.domain.account.valueobj.ValueObjectFactory;
import org.account.domain.account.valueobj.education.AbstructEducation;

/**
 * @author "yangbiao"
 */
public class EducationFactory implements ValueObjectFactory {
    public <T extends AbstructEducation> T createEducationObject(Class<T> c, Object value) {
        AbstructEducation abstructEducation = null;
        try {
            abstructEducation = (AbstructEducation) Class.forName(c.getName()).getConstructor().newInstance(value);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return (T) abstructEducation;
    }
}
