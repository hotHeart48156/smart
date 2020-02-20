package org.order.redis.src.main.java.com.smart.website.common.cache.redis;

import org.order.core.utils.ObjectUtil;
import org.order.core.utils.StringPool;
import org.order.core.utils.StringUtil;

import java.time.Duration;


public abstract class CacheKey {
    public CacheKey(String key, Duration expire) {
    }

    /**
     * 获取前缀
     *
     * @return key 前缀
     */
    public abstract String getPrefix();

    /**
     * 超时时间
     *
     * @return 超时时间
     */

    public Duration getExpire() {
        return null;
    }

    /**
     * 组装 cache key
     *
     * @param suffix 参数
     * @return cache key
     */
    public CacheKey getKey(Object... suffix) {
        String prefix = this.getPrefix();
        // 拼接参数
        String key;
        if (ObjectUtil.isEmpty(suffix)) {
            key = prefix;
        } else {
            key = prefix.concat(StringUtil.join(suffix, StringPool.COLON));
        }
        Duration expire = this.getExpire();
        return expire == null ? new CacheKey(key, expire) {
            @Override
            public String getPrefix() {
                return null;
            }
        }
                : new CacheKey(key, expire) {
            @Override
            public String getPrefix() {
                return null;
            }
        };
    }
}
