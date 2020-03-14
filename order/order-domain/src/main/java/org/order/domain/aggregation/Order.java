package org.order.domain.aggregation;

import lombok.Data;
import org.order.domain.entity.OrderItem;
import org.order.domain.vaueobject.*;
import org.order.domain.vaueobject.fee.*;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.id.GroupId;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.UserId;
import org.order.domain.vaueobject.name.DeliveryCompanyName;
import org.order.domain.vaueobject.name.ReceiverName;
import org.order.domain.vaueobject.name.UserName;
import org.order.domain.vaueobject.phone.PhoneNumber;
import org.order.domain.vaueobject.sn.DeliverySn;
import org.order.domain.vaueobject.sn.OrderSn;
import org.order.domain.vaueobject.status.ConfirmStatus;
import org.order.domain.vaueobject.status.DeleteStatus;
import org.order.domain.vaueobject.status.OrderStatus;
import org.order.domain.vaueobject.time.AutoConfirmTime;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.time.DeliveryTime;
import org.order.domain.vaueobject.time.PaymentTime;
import org.order.domain.vaueobject.type.BillType;
import org.order.domain.vaueobject.type.OrderType;
import org.order.domain.vaueobject.type.SourceType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
public class Order {
    //基本信息

    @Embedded
    private List<OrderItem> orderItems;
    @EmbeddedId
    private OrderId orderId;
    @Embedded
    private UserId userId;
    @Embedded
    private OrderSn orderSn;
    @Embedded
    private GroupId groupId;
    @Embedded
    private UserName userName;
    //费用信息
    @Embedded
    private RepayFee repayFee;
    @Embedded
    private TotalFee totalFee;
    @Embedded
    private PayFee payFee;
    @Embedded
    private FreightFee freightFee;
    @Embedded
    private PromotionFee promotionFee;
    @Embedded
    private IntegrationFee integrationFee;
    @Embedded
    private CouponFee couponFee;
    @Embedded
    private DiscountFee discountFee;


    //订单来源，状态，类型信息
    @Embedded
    private SourceType sourceType;
    @Embedded
    private OrderStatus orderStatus;
    @Embedded
    private OrderType orderType;


    //快递公司信息
    @Embedded
    private DeliveryCompanyName deliveryCompanyName;
    //快递单号
    @Embedded
    private DeliverySn deliverySn;

    //积分，成长值信息
    //获得积分，成长值，如果没有营销加积分的情况下一个订单，一个积分，一个成长值。
    @Embedded
    private Integration integration;
    @Embedded
    private Growth growth;
    //使用积分信息
    @Embedded
    private Integration useIntegration;

    //活动信息
    @Embedded
    private PromoteInfo promoteInfo;
    //发票信息
    @Embedded
    private BillType billType;
    @Embedded
    private BillContent billContent;
    @Embedded
    private BillHead billHead;

    //接收人信息
    @Embedded
    private PhoneNumber ReceiverPhone;
    @Embedded
    private ReceiverName receiverName;
    @Embedded
    private AddressId addressId;
    @Embedded
    private Note note;

    //状态信息
    @Embedded
    private ConfirmStatus confirmStatus;
    @Embedded
    private DeleteStatus deleteStatus;

    //时间信息
    @Embedded
    private PaymentTime paymentTime;
    @Embedded
    private DeliveryTime deliverTime;
    @Embedded
    private AutoConfirmTime autoConfirmTime;
    @Embedded
    private CreateTime createTime;


}
