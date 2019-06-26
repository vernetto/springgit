package org.pierre.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfig {
    @Autowired
    CollectionsBeanMap collectionsBeanMap;

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

    @Bean
    public CollectionsBeanMap getCollectionsBeanMap() {
        CollectionsBeanMap collectionsBeanMap = new CollectionsBeanMap();
        return collectionsBeanMap;
    }

    @Bean
    public Map<Integer, String> nameMap(){
        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(1, "John");
        nameMap.put(2, "Adam");
        nameMap.put(3, "Harry");
        return nameMap;
    }
}
