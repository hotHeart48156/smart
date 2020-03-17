package org.users.eventhandler.canal;

import com.alibaba.otter.canal.protocol.CanalEntry;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.users.domainevent.canalevent.AbstractCanalEvent;

/**
 * @author yangbiao
 */
@Slf4j
public abstract class AbstractCanalEventHandle {
    @EventHandler
    public void on(AbstractCanalEvent event){
        CanalEntry.Entry entry=event.getEntry();
        String database=entry.getHeader().getSchemaName();
        String table=entry.getHeader().getTableName();
    }
}
