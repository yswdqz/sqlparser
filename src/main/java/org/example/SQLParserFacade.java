package org.example;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

import java.util.Locale;

public class SQLParserFacade {
    private final SQLParserExecutor executor;
    private final LoadingCache<String,String> cache;

    public SQLParserFacade(String databaseType, CacheProperties cacheProperties) {
        executor = new SQLParserExecutor(databaseType);
        cache = Caffeine.newBuilder()
                .initialCapacity(cacheProperties.getInitialCapacity())
                .maximumSize(cacheProperties.getMaximumSize())
                .build(executor::parse);
    }
    public String parse(String sql, boolean useCache) {
        sql = sql.toUpperCase(Locale.ROOT);
        if (useCache) {
            return cache.get(sql);
        }
       return executor.parse(sql);
    }
}
