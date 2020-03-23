package org.product.domain.aggragate;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.count.ProductCount;
import org.product.domain.valueobject.id.*;
import org.product.domain.valueobject.name.ProductCategoryName;
import org.product.domain.valueobject.name.ProductName;
import org.product.domain.valueobject.price.ProductPrice;
import org.product.domain.valueobject.price.ProductPromotionPrice;
import org.product.domain.valueobject.sn.ProductSn;
import org.product.domain.valueobject.status.*;
import org.product.domain.valueobject.time.ProductPromotionEndTime;
import org.product.domain.valueobject.time.ProductPromotionPerLimit;
import org.product.domain.valueobject.time.ProductPromotionStartTime;
import org.product.domain.valueobject.type.ProductType;
import org.product.domain.valueobject.type.PromotionType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Product {
    @EmbeddedId
    private ProductId productId;
    @Embedded
    private UserId userId;
    @Embedded
    private BrandId brandId;

    @Embedded
    private ProductCategoryId productCategoryId;
    @Embedded
    private ProductAttributeId productAttributeId;
    @Embedded
    private FeightTemplateId feightTemplateId;
    @Embedded
    private ProductAttributeCategoryId productAttributeCategoryId;
    @Embedded
    private ProductName productName;
    @Embedded
    private ProductPic productPic;

    @Embedded
    private ProductType productType;
    @Embedded
    private ProductSn productSn;
    @Embedded
    private DeleteStatus deleteStatus;
    @Embedded
    private PublishStatus publishStatus;
    @Embedded
    private NewStatus newStatus;
    @Embedded
    private RecommandStatus recommandStatus;
    @Embedded
    private VerifyStatus verifyStatus;
    @Embedded
    private ProductSalesQualitity productSalesQualitity;
    @Embedded
    private ProductPrice productPrice;
    @Embedded
    private ProductPromotionPrice promotionPrice;
    @Embedded
    private GiftGrowth giftGrowth;
    @Embedded
    private GiftPoint giftPoint;
    @Embedded
    private UsePointLimit usePointLimit;
    @Embedded
    private ProductSubtitle productSubtitle;
    @Embedded
    private Title title;
    @Embedded
    private ProductDescription productDescription;
    @Embedded
    private ProductOriginalPrice originalPrice;
    @Embedded
    private ProductStock productStock;

    @Embedded
    private PreviewStatus previewStatus;
    @Embedded
    private ProductService productService;
    @Embedded
    private ProductKeywords productKeywords;
    @Embedded
    private ProductNote productNote;
    @Embedded
    private ProductPromotionStartTime productPromotionStartTime;
    @Embedded
    private ProductPromotionEndTime productPromotionEndTime;
    @Embedded
    private ProductPromotionPerLimit productPromotionPerLimit;
    @Embedded
    private PromotionType promotionType;
    @Embedded
    private ProductCategoryName productCategoryName;
    @Embedded
    private ProductCount productCount;
    @Embedded
    private ShowStatus showStatus;
    @Embedded
    private ProductLogo productLogo;


}
