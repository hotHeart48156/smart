package org.activite;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.context.ApplicationListener;

/**
 * @author yangbiao
 */

public class EventHandle implements ApplicationListener<CanalUpdateEvent> {


    @Override
    public void onApplicationEvent(CanalUpdateEvent canalUpdateEvent) {
        CanalEntry.Entry entry=canalUpdateEvent.getEntry();
        String dataBase=entry.getHeader().getSchemaName();
        String table=entry.getHeader().getTableName();
        CanalEntry.RowChange change;
        try {
            change= CanalEntry.RowChange.parseFrom(entry.getStoreValue());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
