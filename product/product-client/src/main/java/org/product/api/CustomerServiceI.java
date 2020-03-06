package org.product.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
