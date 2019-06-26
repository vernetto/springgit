package org.pierre.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;


public class CollectionsBeanMap {

    private Map<Integer, String> nameMap;

    @Autowired
    public void setNameMap(Map<Integer, String> nameMap) {
        System.out.println("setting map");
        this.nameMap = nameMap;
    }

    public void printNameMap() {
        System.out.println(nameMap);
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

}