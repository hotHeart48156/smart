package org.order.dto.aggredto;

import lombok.NonNull;

/**
 * @author "yangbiao"
 */

public class OrderReceiverAddressDto {
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
