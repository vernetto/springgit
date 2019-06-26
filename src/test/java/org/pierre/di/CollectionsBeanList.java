package org.pierre.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CollectionsBeanList {
    @Autowired
    private List<String> nameList;

    public void printNameList() {
        System.out.println(nameList);
    }
}
