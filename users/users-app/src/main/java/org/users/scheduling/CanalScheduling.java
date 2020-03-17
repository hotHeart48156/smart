package org.users.scheduling;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.users.CanalConnect;
import org.users.domainevent.canalevent.DeleteCanalEvent;
import org.users.domainevent.canalevent.InsertCanalEvent;
import org.users.domainevent.canalevent.UpdateCanalEvent;

import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 */
@Slf4j
public class CanalScheduling implements Runnable {
    @Autowired
    private  CanalConnector canalConnector;
    private ApplicationContext applicationContext;
    @Override
    @Scheduled(fixedDelay = 100)
    public void run() {
        try {

            int batchSize = 1000;
//            Message message = connector.get(batchSize);
            Message message = canalConnector.getWithoutAck(batchSize);
            long batchId = message.getId();
            log.debug("scheduled_batchId=" + batchId);
            try {
                List<CanalEntry.Entry> entries = message.getEntries();
                if (batchId != -1 && entries.size() > 0) {
                    entries.forEach(entry -> {
                        if (entry.getEntryType() == CanalEntry.EntryType.ROWDATA) {
                            publishCanalEvent(entry);
                        }
                    });
                }
                canalConnector.ack(batchId);
            } catch (Exception e) {
                log.error("发送监听事件失败！batchId回滚,batchId=" + batchId, e);
                canalConnector.rollback(batchId);
            }
        } catch (Exception e) {
            log.error("canal_scheduled异常！", e);
        }

    }
    private void publishCanalEvent(CanalEntry.Entry entry) {
        CanalEntry.EventType eventType = entry.getHeader().getEventType();
        switch (eventType) {
            case INSERT:
                applicationContext.publishEvent(new InsertCanalEvent(entry));
                break;
            case UPDATE:
                applicationContext.publishEvent(new UpdateCanalEvent(entry));
                break;
            case DELETE:
                applicationContext.publishEvent(new DeleteCanalEvent(entry));
                break;
            default:
                break;
        }
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
