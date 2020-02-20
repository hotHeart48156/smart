package org.account.kafka.configuration.product.conf;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "yangbiao"
 * @create 2019121811:13
 */
@org.springframework.context.annotation.Configuration
public class ProductConfig implements Configuration {
    @Override
    @Bean
    public Map<String, Object> producderConfigs() {
        Map<String, Object> props = new HashMap<>(30);
        //用户设定，用于跟踪记录消息，默认 ""
        props.put(ProducerConfig.CLIENT_ID_CONFIG, 15);
        // 指定Kafka集群所需的broker地址清单，默认 ""
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        //消息发送失败重试次数，默认0
        props.put(ProducerConfig.RETRIES_CONFIG, "3");
        //指定ProducerBatch在延迟多少毫秒后再发送，但如果在延迟的这段时间内batch的大小已经到了batch.size设置的大小，那么消息会被立即发送，不会再等待，默认值0
        props.put(ProducerConfig.LINGER_MS_CONFIG, 0);
        //指定分区中必须有多少个副本收到这条消息，才算消息发送成功，默认值1，字符串类型
        props.put(ProducerConfig.ACKS_CONFIG, "2");
        //指定ProducerBatch内存区域的大小，默认16kb
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16000);
        //指定消息的压缩方式，默认不压缩
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "gzip");
        //key序列化
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //value序列化
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //设置事务id，必须唯一
        props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, "115");
        //事务超时时间，默认60000ms
        props.put(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, 70000);
        // 限制生产者客户端发送消息的最大值，默认1MB
        props.put(ProducerConfig.MAX_REQUEST_SIZE_CONFIG, 2);
        //尝试连接到Kafka，生产者客户端等待的最大时间，默认1000ms
        props.put(ProducerConfig.RECONNECT_BACKOFF_MAX_MS_CONFIG, 1000);
        //连接失败后，尝试连接Kafka的时间间隔，默认50ms
        props.put(ProducerConfig.RECONNECT_BACKOFF_MS_CONFIG, 50);
        //开启幂等性----------------------------------------
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, true);
        //自定义拦截器，实现ProducerInterceptor接口
        props.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG, "");
        //可以在一个connection中发送多个请求，叫作一个flight,这样可以减少开销，但是如果产生错误，可能会造成数据的发送顺序改变,默认5
        props.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, 5);
        //日志记录级别，默认info
        props.put(ProducerConfig.METRICS_RECORDING_LEVEL_CONFIG, "info");
        // 用于维护metrics的样本数量，默认2
        props.put(ProducerConfig.METRICS_NUM_SAMPLES_CONFIG, 4);
        //样本计算时间窗口，默认30000ms
        props.put(ProducerConfig.METRICS_SAMPLE_WINDOW_MS_CONFIG, 30000);
        //强制刷新元数据时间，毫秒，默认300000，5分钟
        props.put(ProducerConfig.METADATA_MAX_AGE_CONFIG, 300000);
        //消息发送失败重试时间间隔，默认100ms
        props.put(ProducerConfig.RETRY_BACKOFF_MS_CONFIG, 100);
        //控制生产者客户端send()方法和partitionsFor()方法的阻塞时间。当生产者的发送缓存区已满，或者没有可用元数据时，这些方法就会阻塞,默认60s
        props.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, 60000);
        //Socket发送缓冲区大小，默认128kb,-1将使用操作系统的设置
        props.put(ProducerConfig.SEND_BUFFER_CONFIG, 128);
        //Socket接收缓冲区大小，默认32kb,-1将使用操作系统的设置
        props.put(ProducerConfig.RECEIVE_BUFFER_CONFIG, 32);
        return props;
    }
}
