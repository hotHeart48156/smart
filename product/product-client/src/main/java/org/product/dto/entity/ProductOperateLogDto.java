package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductOperateLog;
@Data
public class ProductOperateLogDto   extends AbstractEntityDto{
    public void accept(ProductOperateLog productoperatelog) {
    }
}
