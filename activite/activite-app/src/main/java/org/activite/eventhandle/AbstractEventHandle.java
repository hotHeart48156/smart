package org.activite.eventhandle;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.google.protobuf.InvalidProtocolBufferException;
import org.activite.TablePrimaryKey;
import org.activite.event.AbstractCanalEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 */
@Component
public abstract class AbstractEventHandle <Event extends AbstractCanalEvent> implements ApplicationListener<Event> {
    @Autowired
    TablePrimaryKey tablePrimaryKey;

    @Override
    public void onApplicationEvent(Event event) {
        CanalEntry.Entry entry = event.getEntry();
        String database = entry.getHeader().getSchemaName();
        String tableName = entry.getHeader().getTableName();
        CanalEntry.RowChange rowChange = null;
        if (entry.getEntryType() == CanalEntry.EntryType.ROWDATA) {
            try {
                rowChange = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }

        }
        rowChange.getRowDatasList().forEach(rowData ->doSync(database,tableName,rowData));
    }
    Map<String, Object> parseColumnsToMap(List<CanalEntry.Column> columns) {
        Map<String, Object> jsonMap = new HashMap<>();
        columns.forEach(column -> {
            if (column == null) {
                return;
            }
            jsonMap.put(column.getName(), column.getIsNull() ? null :column.getValue());
        });
        return jsonMap;
    }
    protected abstract void doSync(String database, String table,  CanalEntry.RowData rowData);



}









