package org.activite.executor.query.entity;

import org.activite.executor.AbstractQuery;

/**
 * @author yangbiao
 */

public abstract class AbstractEntityQuery  extends AbstractQuery {
    public  String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
