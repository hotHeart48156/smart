package org.account.controller;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.account.api.CustomerServiceI;
import org.account.cq.CustomerAddCmd;
import org.account.cq.CustomerListByNameQry;
import org.account.dto.domainmodel.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @GetMapping(value = "/customer")
    public MultiResponse<Customer> listCustomerByName(@RequestParam String name) {
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd) {
        return customerService.addCustomer(customerAddCmd);
    }
}
