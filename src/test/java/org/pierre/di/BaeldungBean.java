package org.pierre.di;

public class BaeldungBean {
    private String name;

    public BaeldungBean(String name) {
        this.name = name;
    }

    public BaeldungBean() {
    }

    @Override
    public String toString() {
        return "BaeldungBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
