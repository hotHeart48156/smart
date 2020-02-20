package org.activite.dto;

import com.alibaba.cola.dto.Command;
import org.activite.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command {

    private Customer customer;

}
