package org.account.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.account.cq.CustomerAddCmd;
import org.account.cq.CustomerListByNameQry;
import org.account.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
