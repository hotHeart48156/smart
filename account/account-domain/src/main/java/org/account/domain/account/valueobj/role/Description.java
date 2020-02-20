package org.account.domain.account.valueobj.role;

/**
 * @author "yangbiao"
 */
public class Description extends AbstructRole {
    private String description;

    Description(String Descri) {
        description = Descri;
    }

    public String getDescription() {
        return description;
    }
}
