package com.smart.website.message.kafka.configuration.consume.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "yangbiao"
 * @create 2019121810:34
 */
public class ConsumeConfigDev implements ConsumeConfig {
    @Override
    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>(30);
        //消费者所属消费组的唯一标识
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "6");
        //连接集群broker地址
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        //是否开启自动提交消费位移的功能，默认true
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        //自动提交消费位移的时间间隔，默认5000ms
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, 5000);
        //消费者的分区配置策略, 默认 RangeAssignor
        props.put(ConsumerConfig.PARTITION_ASSIGNMENT_STRATEGY_CONFIG, "RangeAssignor");
        //如果分区没有初始偏移量，或者当前偏移量服务器上不存在时，将使用的偏移量设置，earliest从头开始消费，latest从最近的开始消费，none抛出异常
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        //消费者客户端一次请求从Kafka拉取消息的最小数据量，如果Kafka返回的数据量小于该值，会一直等待，直到满足这个配置大小，默认1b
        props.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG, 100);
        //消费者客户端一次请求从Kafka拉取消息的最大数据量，默认50MB
        props.put(ConsumerConfig.FETCH_MAX_BYTES_CONFIG, 5000000);
        //从Kafka拉取消息时，在不满足fetch.min.bytes条件时，等待的最大时间，默认500ms
        props.put(ConsumerConfig.FETCH_MAX_WAIT_MS_CONFIG, 500);
        //设置从每个分区里返回给消费者的最大数据量，区别于fetch.max.bytes，默认1MB
        props.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, 1000000);
        // 强制刷新元数据时间，毫秒，默认300000，5分钟
        props.put(ConsumerConfig.METADATA_MAX_AGE_CONFIG, 300000);
        props.put(ConsumerConfig.CLIENT_ID_CONFIG, "-h5-consumer");
        //value反序列化
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        //key反序列化
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        // Socket发送缓冲区大小，默认128kb,-1将使用操作系统的设置
        props.put(ConsumerConfig.SEND_BUFFER_CONFIG, 128);
        //发送缓冲区大小，默认64kb,-1将使用操作系统的设置
        props.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, 64);
        //连接失败后，尝试连接Kafka的时间间隔，默认50ms
        props.put(ConsumerConfig.RECONNECT_BACKOFF_MS_CONFIG, 50);
        //尝试连接到Kafka，消费者客户端等待的最大时间，默认1000ms
        props.put(ConsumerConfig.RECONNECT_BACKOFF_MAX_MS_CONFIG, 1000);
        //一次拉取请求的最大消息数，默认50条
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 50);
        //指定拉取消息线程最长空闲时间，默认300000ms
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 300000);
        //消费者会话
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 10000);
        //消费者心跳时间，默认3000ms
        props.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, 3000);
        //如果设置为“read committed”，那么消费者就会忽略事务未提交的消息，即只能消 费到 LSO (LastStableOffset)的位置，默认情况下为 “read_uncommitted”，即可以消 费到 HW (High Watermark)处的位置
        props.put(ConsumerConfig.ISOLATION_LEVEL_CONFIG, "read_uncommitted");
        //内部的主题:一consumer_offsets 和一transaction_state。该参数用来指定 Kafka 中的内部主题是否可以向消费者公开，默认值为 true。如果设置为 true，那么只能使用 subscribe(Collection)的方式而不能使用 subscribe(Pattern)的方式来订阅内部主题，设置为 false 则没有这个限制。
        props.put(ConsumerConfig.EXCLUDE_INTERNAL_TOPICS_CONFIG, false);
        //自定义拦截器
        props.put(ConsumerConfig.INTERCEPTOR_CLASSES_CONFIG, "60000");
        //设置消费者api超时时间，默认60000ms
        props.put(ConsumerConfig.DEFAULT_API_TIMEOUT_MS_CONFIG, 600000);
        //客户端将等待请求的响应的最大时间,如果在这个时间内没有收到响应，客户端将重发请求，超过重试次数将抛异常，默认30000ms
        props.put(ConsumerConfig.REQUEST_TIMEOUT_MS_CONFIG, 3000);
        //设置多久之后关闭空闲连接，默认540000ms
        props.put(ConsumerConfig.CONNECTIONS_MAX_IDLE_MS_CONFIG, 540000);
        //样本计算时间窗口，默认30000ms
        props.put(ConsumerConfig.METRICS_SAMPLE_WINDOW_MS_CONFIG, 30000);
        //用于维护metrics的样本数量，默认2
        props.put(ConsumerConfig.METRICS_NUM_SAMPLES_CONFIG, 2);
        //metrics日志记录级别，默认info
        props.put(ConsumerConfig.METRICS_RECORDING_LEVEL_CONFIG, true);
        //类的列表，用于衡量指标，默认空list
        props.put(ConsumerConfig.METRIC_REPORTER_CLASSES_CONFIG, "");
        //自动检查CRC32记录的消耗
        props.put(ConsumerConfig.CHECK_CRCS_CONFIG, true);
        return props;
    }

}
