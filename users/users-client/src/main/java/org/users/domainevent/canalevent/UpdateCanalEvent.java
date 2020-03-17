package org.users.domainevent.canalevent;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author yangbiao
 */

public class UpdateCanalEvent extends AbstractCanalEvent {
    public UpdateCanalEvent(CanalEntry.Entry entry) {
        super(entry);
    }
}
