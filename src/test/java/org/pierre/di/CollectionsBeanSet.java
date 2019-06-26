package org.pierre.di;

import java.util.Set;

public class CollectionsBeanSet {
    private Set<String> nameSet;

    public CollectionsBeanSet(Set<String> strings) {
        this.nameSet = strings;
    }

    public void printNameSet() {
        System.out.println(nameSet);
    }
}
