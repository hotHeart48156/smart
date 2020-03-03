package org.product.domain.aggragate;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.*;
import org.product.domain.valueobject.name.BrandName;
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

import javax.persistence.Entity;
import java.util.Set;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Product {
    private ProductId productId;
    private MemberId memberId;
    private BrandId brandId;
    private Set<CommentId> commentIds;
    private Set<Id> giftsIds;

    private ProductCategoryId productCategoryId;
    private ProductAttributeId productAttributeId;
    private FeightTemplateId feightTemplateId;
    private ProductAttributeCategoryId productAttributeCategoryId;
    private ProductName productName;
    private ProductPic productPic;
    private ProductType productType;
    private ProductSn productSn;
    private DeleteStatus deleteStatus;
    private PublishStatus publishStatus;
    private NewStatus newStatus;
    private RecommandStatus recommandStatus;
    private VerifyStatus verifyStatus;
    private ProductSalesQualitity productSalesQualitity;
    private ProductPrice productPrice;
    private ProductPromotionPrice promotionPrice;
    private GiftGrowth giftGrowth;
    private GiftPoint giftPoint;
    private UsePointLimit usePointLimit;
    private ProductSubtitle productSubtitle;
    private ProductDescription productDescription;
    private ProductOriginalPrice originalPrice;
    private ProductStock productStock;
    private ProductStock lowStock;
    private ProductUnit unit;
    private ProductWeight productWeight;
    private PreviewStatus previewStatus;
    private ProductService productService;
    private ProductKeywords productKeywords;
    private ProductNote productNote;
    private ProductDetailTitle productDetailTitle;
    private ProductDetailDesc productDetailDesc;
    private ProductPromotionStartTime productPromotionStartTime;
    private ProductPromotionEndTime productPromotionEndTime;
    private ProductPromotionPerLimit productPromotionPerLimit;
    private PromotionType promotionType;
    private BrandName brandName;
    private ProductCategoryName productCategoryName;


}
