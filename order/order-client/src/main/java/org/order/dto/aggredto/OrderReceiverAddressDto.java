package org.order.dto.aggredto;

import lombok.NonNull;
import org.order.dto.AbstractDto;

/**
 * @author "yangbiao"
 */

public class OrderReceiverAddressDto   extends AbstractDto {
    private String receiverName;
    @NonNull
    private String province;

    @NonNull
    private String city;

    @NonNull
    private String region;

    @NonNull
    private String postcode;

    @NonNull
    private String detail;

}
