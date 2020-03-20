package org.activite;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.springframework.context.ApplicationEvent;

/**
 * @author yangbiao
 */

public class CanalUpdateEvent extends ApplicationEvent {
    private CanalEntry.Entry entry;

    public CanalUpdateEvent(Object source) {
        super(source);
    }

    public void update(CanalEntry.Entry entry){
        this.entry=entry;
    }

    public CanalEntry.Entry getEntry() {
        return entry;
    }
}
