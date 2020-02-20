package org.account.cq;

import com.alibaba.cola.dto.Command;
import org.account.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command {

    private Customer customer;

}
