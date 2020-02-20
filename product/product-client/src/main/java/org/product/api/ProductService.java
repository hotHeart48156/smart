package org.product.api;

import org.product.dto.*;

import java.util.List;

/**
 * @author "yangbiao"
 */
public interface ProductService {
    void addProduct(ProductAddCmd productAddCmd);

    void removeProduct(ProductRemoveCmd productRemoveCmd);

    List<ProductService> findProductByTitle(FindProductByTitleQry findProductByTitleQry);

    void addProductAttribute(ProductAttributeAddCmd productAttributeAddCmd);

    void buyProduct(BuyProductCmd buyProductCmd);

    void addProductComment(ProductCommentAddCmd productCommentAddCmd);

}
