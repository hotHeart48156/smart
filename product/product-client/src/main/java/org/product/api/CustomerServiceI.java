package org.product.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.product.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
