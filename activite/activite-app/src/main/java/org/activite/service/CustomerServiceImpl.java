package org.activite.service;

import com.alibaba.cola.command.CommandBusI;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.activite.api.CustomerServiceI;
import org.activite.dto.CustomerAddCmd;
import org.activite.dto.CustomerListByNameQry;
import org.activite.dto.domainmodel.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;

    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response) commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry) {
        return (MultiResponse<Customer>) commandBus.send(customerListByNameQry);
    }

}
