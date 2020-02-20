package org.admin.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.admin.dto.CustomerAddCmd;
import org.admin.dto.CustomerListByNameQry;
import org.admin.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
