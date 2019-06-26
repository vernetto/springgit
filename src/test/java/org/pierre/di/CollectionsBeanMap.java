package org.pierre.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class CollectionsBeanMap {

    private Map<Integer, String> nameMap;

    @Autowired
    public void setNameMap(Map<Integer, String> nameMap) {
        this.nameMap = nameMap;
    }

    public void printNameMap() {
        System.out.println(nameMap);
    }
}