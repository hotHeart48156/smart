package org.account.gateway.cache;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import io.netty.util.internal.ObjectUtil;
import org.mockito.internal.util.StringUtil;

import java.time.Duration;

/**
 * @author "yangbiao"
 */
public abstract class CacheKey implements org.account.domain.gateway.cache.CacheKey {
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
        if (ObjectUtil.checkNotNull(suffix)) {
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
