package org.users.domainevent.canalevent;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author yangbiao
 */

public class DeleteCanalEvent extends AbstractCanalEvent {
    public DeleteCanalEvent(CanalEntry.Entry entry) {
        super(entry);
    }
}
