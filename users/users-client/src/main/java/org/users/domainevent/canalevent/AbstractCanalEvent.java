package org.users.domainevent.canalevent;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.users.domainevent.AbstractEvent;

/**
 * @author yangbiao
 */

public abstract class AbstractCanalEvent {
    private CanalEntry.Entry entry;
    public AbstractCanalEvent(CanalEntry.Entry entry){
       entry=this.entry;
    }
    public CanalEntry.Entry getEntry(){
        return entry;
    }
}
