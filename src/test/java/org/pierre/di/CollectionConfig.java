package org.pierre.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionsBeanList getCollectionsBeanList() {
        return new CollectionsBeanList();
    }

    @Bean
    public List<String> nameList() {
        return Arrays.asList("John", "Adam", "Harry");
    }

    @Bean
    public CollectionsBeanSet getCollectionsBeanSet() {
        return new CollectionsBeanSet(new HashSet<>(Arrays.asList("John", "Adam", "Harry")));
    }
}
