package org.product.dto;

import com.geekhalo.ddd.lite.domain.AggregateEvent;
import org.product.domain.aggragate.ProductFindByTitle;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class FindProductByTitleQry implements AggregateEvent<Long, ProductFindByTitle> {
    @Override
    public ProductFindByTitle source() {
        return null;
    }

    @Override
    public String id() {
        return null;
    }

    @Override
    public Date occurredOn() {
        return null;
    }
}
