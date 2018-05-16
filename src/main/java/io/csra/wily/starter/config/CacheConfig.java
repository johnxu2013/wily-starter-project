package io.csra.wily.starter.config;

import io.csra.wily.components.cache.EhCacheConfiguration;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

// @Configuration
// @EnableCaching
public class CacheConfig extends EhCacheConfiguration {

    @Override
    protected List<CacheConfiguration> getCacheConfigurations() {
        return new ArrayList<>();
    }
}
