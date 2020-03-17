package org.users.domainevent.canalevent;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author yangbiao
 */

public class InsertCanalEvent extends AbstractCanalEvent {
    public InsertCanalEvent(CanalEntry.Entry entry) {
        super(entry);
    }
}
