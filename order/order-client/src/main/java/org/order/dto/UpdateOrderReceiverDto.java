package org.order.dto;

/**
 * @author "yangbiao"
 */

public class UpdateOrderReceiverDto {
    private String receiverName;
    @NotNull
    private String province;

    @NotNull
    private String city;

    @NotNull
    private String region;

    @NotNull
    private String postcode;

    @NotNull
    private String detail;

}
