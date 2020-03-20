package org.activite;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.google.common.collect.Lists;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * @author yangbiao
 */
@Slf4j
public class CanalClient implements DisposableBean {
    private CanalConnector canalConnector;

    @Value("${canal.host}")
    private String canalHost;
    @Value("${canal.port}")
    private String canalPort;
    @Value("${canal.destination}")
    private String canalDestination;
    @Value("${canal.username}")
    private String canalUsername;
    @Value("${canal.password}")
    private String canalPassword;

    @Bean
    public CanalConnector getCanalConnector() {
        canalConnector = CanalConnectors.newClusterConnector(Lists.newArrayList(new InetSocketAddress(canalHost, Integer.valueOf(canalPort))), canalDestination, canalUsername, canalPassword);
        canalConnector.connect();
        // 指定filter，格式 {database}.{table}，这里不做过滤，过滤操作留给用户
        canalConnector.subscribe();
        // 回滚寻找上次中断的位置
        canalConnector.rollback();
        log.info("canal客户端启动成功");
        return canalConnector;
        while (true) {
            try {
                Message message=canalConnector.getWithoutAck(1000);


            }catch ()

        }
        }
    }
    public void printEntry(List<CanalEntry.Entry> entries){
        for (CanalEntry.Entry entry:entries){
            CanalEntry.Header header=entry.getHeader();
            CanalEntry.EventType entryType=header.getEventType();
            if (entryType.equals(CanalEntry.EntryType.ROWDATA)){
                CanalEntry.RowChange rowChange=null;
                try {
                     rowChange= CanalEntry.RowChange.parseFrom(entry.getStoreValue());

                }catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                rowChange.getRowDatasList().forEach(rowData -> {
                    List<CanalEntry.Column> columns=rowData.getAfterColumnsList();
                   columns.forEach(column -> column.getIsKey()&&column.);

                });

            }

        }
    }

    @Override
    public void destroy() throws Exception {
        if (canalConnector != null) {
            canalConnector.disconnect();
        }
    }


}
