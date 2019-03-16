package pl.itger.hazelcastConfig;

import com.hazelcast.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {
//private static final int TTL_SECS = 60 * 60;
@Bean
public Config config() {
    return new Config(); // Set up any non-default config here
    /*new MapConfig()
   .setName(ChatServiceHazelcastImpl.ACCEPTED_MESSAGES_TRACKING_MAP_NAME)
    .setEvictionPolicy(EvictionPolicy.LRU)
    .setTimeToLiveSeconds(TTL_SECS));
*/
}
}
