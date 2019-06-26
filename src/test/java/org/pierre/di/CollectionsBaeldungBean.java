package org.pierre.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CollectionsBaeldungBean {
    @Autowired(required = false)
    private List<BaeldungBean> beanList;

    public void printBeanList() {
        System.out.println(beanList);
    }
}
