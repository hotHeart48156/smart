package org.order.domain.customer.aggregation;

import lombok.Data;
import org.order.domain.customer.entity.Address;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.vaueobject.*;
import org.order.domain.customer.vaueobject.fee.*;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.customer.vaueobject.name.DeliveryCompanyName;
import org.order.domain.customer.vaueobject.name.ProductName;
import org.order.domain.customer.vaueobject.name.ReceiverName;
import org.order.domain.customer.vaueobject.name.UserName;
import org.order.domain.customer.vaueobject.phone.PhoneNumber;
import org.order.domain.customer.vaueobject.sn.DeliverySn;
import org.order.domain.customer.vaueobject.sn.OrderSn;
import org.order.domain.customer.vaueobject.status.ConfirmStatus;
import org.order.domain.customer.vaueobject.status.DeleteStatus;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.*;
import org.order.domain.customer.vaueobject.type.BillType;
import org.order.domain.customer.vaueobject.type.OrderType;
import org.order.domain.customer.vaueobject.type.SourceType;

import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
public class Order {

    //基本信息
    private List<OrderItem> orderItems;
    private OrderId orderId;
    private UserId userId;
    private OrderSn orderSn;
    private GroupId groupId;
    private UserName userName;
    //费用信息
    private RepayFee repayFee;
    private TotalFee totalFee;
    private PayFee payFee;
    private FreightFee freightFee;
    private PromotionFee promotionFee;
    private IntegrationFee integrationFee;
    private CouponFee couponFee;
    private DiscountFee discountFee;


    //订单来源，状态，类型信息
    private SourceType sourceType;
    private OrderStatus orderStatus;
    private OrderType orderType;


    //快递公司信息
    private DeliveryCompanyName deliveryCompanyName;
    //快递单号
    private DeliverySn deliverySn;

    //积分，成长值信息
    //获得积分，成长值，如果没有营销加积分的情况下一个订单，一个积分，一个成长值。
    private Integration integration;
    private Growth growth;
    //使用积分信息
    private Integration useIntegration;

    //活动信息
    private PromoteInfo promoteInfo;
    //发票信息
    private BillType billType;
    private BillContent billContent;
    private BillHead billHead;

    //接收人信息
    private PhoneNumber ReceiverPhone;
    private ReceiverName receiverName;
    private Address address;
    private Note note;

    //状态信息
    private ConfirmStatus confirmStatus;
    private DeleteStatus deleteStatus;

    //时间信息
    private PaymentTime paymentTime;
    private DeliveryTime deliverTime;
    private AutoConfirmTime autoConfirmTime;
    private CreateTime createTime;


}
