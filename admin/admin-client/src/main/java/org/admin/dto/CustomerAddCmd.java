package org.admin.dto;

import com.alibaba.cola.dto.Command;
import org.admin.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command {

    private Customer customer;

}
