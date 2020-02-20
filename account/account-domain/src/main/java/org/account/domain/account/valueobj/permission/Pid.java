package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class Pid extends AbstructPermission {
    private Long pid;

    Pid(Long Pid) {
        pid = Pid;
    }

    public Long getPid() {
        return pid;
    }
}
