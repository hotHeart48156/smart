package org.product.controller;

import org.product.api.ProductService;
import org.product.dto.BuyProductCmd;
import org.product.dto.ProductAddCmd;
import org.product.dto.ProductCommentAddCmd;
import org.product.dto.ProductRemoveCmd;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author "yangbiao"
 */
@RestController
public class ProductController {
    private ProductService productService;

    void addProduct(ProductAddCmd productAddCmd) {
    }

    void removeProduct(ProductRemoveCmd productRemoveCmd) {
    }

    void buyComment(BuyProductCmd buyProductCmd) {
    }

    void addProductComment(ProductCommentAddCmd productCommentAddCmd) {
    }

    void findProductByTitle(String productTitle) {
    }
}
