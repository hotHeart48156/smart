package org.activite.event;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.springframework.context.ApplicationEvent;

/**
 * @author yangbiao
 */

public abstract class AbstractCanalEvent extends ApplicationEvent {

    public AbstractCanalEvent(Object source) {
        super(source);
    }
    public CanalEntry.Entry getEntry() {
        return (CanalEntry.Entry) source;
    }
}
