package org.product.dto.aggregationDto;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.BrandId;
import org.product.domain.valueobject.id.UserId;
import org.product.dto.AbstractDto;

import java.math.BigDecimal;

/**
 * @author yangbiao
 */

public class CreateProductDto extends AbstractDto {
    private String userId;
    private Long brandId;
    private Long productCategoryId;
    private Long productAttributeCategoryId;
    private String name;
    private String pic;
    private Integer type;// 1出售、2义卖、3免费
    /**
     * 货号
     */
    private BigDecimal price;//卖价
    private BigDecimal originPrice;//成本价
    private BigDecimal promotionPrice;//营销家
    private String title;
    private String subTitle;
    private int stock;

    public void accept(Product product) {
        product.setBrandId(ValueObjectFactory.newInstance(BrandId.class, brandId));
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        product.setProductCategoryId(ValueObjectFactory.newInstance());
        product.setProductName(ValueObjectFactory.newInstance());
        product.setProductAttributeCategoryId(ValueObjectFactory.newInstance());
        product.setProductPic(ValueObjectFactory.newInstance());
        product.setProductType(ValueObjectFactory.newInstance());
        product.setOriginalPrice(ValueObjectFactory.newInstance());
        product.setProductPrice(ValueObjectFactory.newInstance());
        product.setPromotionPrice(ValueObjectFactory.newInstance());
        product.setProductSubtitle(ValueObjectFactory.newInstance());
        product.setTitle(ValueObjectFactory.newInstance());
        product.setProductStock(ValueObjectFactory.newInstance());

    }


}
