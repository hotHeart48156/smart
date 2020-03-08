package com.smart.website.demo.commons.design.test.container.command;


import com.smart.website.demo.commons.design.test.container.TestsContainer;
import org.apache.commons.cli.Options;

/**
 * @author shawnzhan.zxy
 * @date 2019/03/19
 */
public class TestClassRunCmd extends AbstractCommand {
    private String className;

    public TestClassRunCmd(String cmdRaw) {
        super(cmdRaw);
        this.className = cmdRaw;
    }

    @Override
    protected void action() {
        try {
            TestsContainer.getTestExecutor().execute(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getClassName() {
        return className;
    }
}
