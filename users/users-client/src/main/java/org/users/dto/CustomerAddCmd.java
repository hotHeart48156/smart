package org.users.dto;

import com.alibaba.cola.dto.Command;
import org.users.dto.domainmodel.Customer;
import lombok.Data;
import

@Data
public class CustomerAddCmd extends Command {

    private Customer customer;

}
