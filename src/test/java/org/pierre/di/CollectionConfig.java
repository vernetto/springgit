package org.pierre.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionsBeanList getCollectionsBean() {
        return new CollectionsBeanList();
    }

    @Bean
    public List<String> nameList() {
        return Arrays.asList("John", "Adam", "Harry");
    }
}
