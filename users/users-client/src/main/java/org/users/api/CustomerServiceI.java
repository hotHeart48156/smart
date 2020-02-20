package org.users.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.users.dto.CustomerAddCmd;
import org.users.dto.CustomerListByNameQry;
import org.users.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
