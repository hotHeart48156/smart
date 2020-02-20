package org.activite.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.activite.dto.CustomerAddCmd;
import org.activite.dto.CustomerListByNameQry;
import org.activite.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
