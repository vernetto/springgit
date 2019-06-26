package org.pierre.springgit;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Store {
    String name;
    public Store() {
        name = "pippo";
    }

    public Store(String name) {
        this.name = name;
    }
}
