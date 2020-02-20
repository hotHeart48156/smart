package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.*;
import org.order.domain.customer.vaueobject.address.City;
import org.order.domain.customer.vaueobject.address.DetailAddress;
import org.order.domain.customer.vaueobject.address.Province;
import org.order.domain.customer.vaueobject.address.Region;
import org.order.domain.customer.vaueobject.code.PostCode;
import org.order.domain.customer.vaueobject.fee.*;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.customer.vaueobject.name.DeliveryCompanyName;
import org.order.domain.customer.vaueobject.name.GoodsName;
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

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Order extends JpaEntity {

    private Blance blance;
    private List<OrderItem> orderItems;

    private OrderId orderId;

    private MemberId memberId;

    private OrderSn orderSn;

    private CreateTime createTime;

    private UserName userName;

    private TotalFee totalFee;

    private PayFee payFee;

    private FreightFee freightFee;

    private PromotionFee promotionFee;

    private IntegrationFee integrationFee;

    private CouponFee couponFee;

    private DiscountFee discountFee;
    private SourceType sourceType;
    private OrderStatus orderStatus;
    private OrderType orderType;
    private DeliveryCompanyName deliveryCompanyName;
    private DeliverySn deliverySn;
    private AutoConfirmTime autoConfirmTime;
    private Integration integration;
    private Growth growth;
    private PromoteInfo promoteInfo;
    private BillType billType;
    private BillContent billContent;
    private PhoneNumber billReceiverPhone;
    private Email billReceiverEmail;
    private ReceiverName receiverName;
    private PostCode receiverPostCode;
    private Province receiverProvince;
    private City receiverCity;
    private Region receiverRegion;
    private DetailAddress receiverDetailAddress;
    private Note note;
    private ConfirmStatus confirmStatus;
    private DeleteStatus deleteStatus;
    private Integration useIntegration;
    private PaymentTime paymentTime;
    private DeliveryTime deliverTime;
    private CommentTime commentTime;
    private ModifyTime modifyTime;
    private RepayId repayId;
    private SupplyId supplyId;
    private GoodsId goodsId;
    private SchoolId schoolId;
    private GroupId groupId;
    private GoodsName goodsName;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
