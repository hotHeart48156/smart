package org.order.domain.vaueobject.type;

/**
 * @author "yangbiao"
 */
public enum PayType implements Type {
    /**
     * 支付方式：0->未支付；1->支付宝；2->微信 3余额支付
     */
    a("未支付", 0), b("支付宝", 1), c("微信", 3), d("余额支付", 4);

    PayType(String s, int i) {

    }
}
