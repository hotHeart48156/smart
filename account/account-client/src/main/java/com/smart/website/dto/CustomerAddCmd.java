package com.smart.website.dto;

import com.alibaba.cola.dto.Command;
import com.smart.website.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command {

    private Customer customer;

}
