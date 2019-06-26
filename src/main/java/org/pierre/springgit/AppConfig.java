package org.pierre.springgit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Store getStore() {
        return new Store("pluto");
    }
}
