package org.product.dto.aggregation;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.id.BrandId;
import org.product.domain.valueobject.id.UserId;
import org.product.domain.valueobject.name.BrandName;
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

    public void accept(Product product){
        product.setBrandId(ValueObjectFactoty.newInstance(BrandId.class,brandId));
        product.setUserId(ValueObjectFactoty.newInstance(UserId.class,userId));
        product.setProductCategoryId(ValueObjectFactoty.newInstance());
        product.setProductName(ValueObjectFactoty.newInstance());
        product.setProductAttributeCategoryId(ValueObjectFactoty.newInstance());
        product.setProductPic(ValueObjectFactoty.newInstance());
        product.setProductType(ValueObjectFactoty.newInstance());
        product.setOriginalPrice(ValueObjectFactoty.newInstance());
        product.setProductPrice(ValueObjectFactoty.newInstance());
        product.setPromotionPrice(ValueObjectFactoty.newInstance());
        product.setProductSubtitle(ValueObjectFactoty.newInstance());
        product.setTitle(ValueObjectFactoty.newInstance());
        product.setProductStock(ValueObjectFactoty.newInstance());

    }


}
