package org.product.test;

import com.alibaba.cola.dto.Response;
import org.product.api.CustomerServiceI;
import org.product.common.BizCode;
import org.product.dto.CustomerAddCmd;
import org.product.dto.domainmodel.Customer;
import org.product.dto.domainmodel.ErrorCode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is for integration test.
 * <p>
 * Created by fulan.zjf on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerServiceI customerService;


    @Before
    public void setUp() {

    }

    @Test
    public void testCustomerAddSuccess() {
        //1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        Customer customer = new Customer();
        customer.setCompanyName("NormalName");
        customerAddCmd.setCustomer(customer);

        //2.execute
        Response response = customerService.addCustomer(customerAddCmd);

        //3.assert
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void testCustomerAddCompanyNameConflict() {
        //1.prepare
        CustomerAddCmd customerAddCmd = new CustomerAddCmd();
        Customer customer = new Customer();
        customer.setCompanyName("ConflictCompanyName");
        customerAddCmd.setCustomer(customer);

        //2.execute
        Response response = customerService.addCustomer(customerAddCmd);

        //3.assert
        Assert.assertEquals(ErrorCode.B_CUSTOMER_companyNameConflict.getErrCode(), response.getErrCode());

    }
}