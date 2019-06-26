package org.pierre.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
public class CollectionTest {
    @Test
    public void testList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBeanList collectionsBean = context.getBean(CollectionsBeanList.class);
        collectionsBean.printNameList();
    }

    @Test
    public void testSet() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBeanSet collectionsBean = context.getBean(CollectionsBeanSet.class);
        collectionsBean.printNameSet();
    }

    @Test
    public void testMap() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBeanMap collectionsBean = context.getBean(CollectionsBeanMap.class);
        collectionsBean.printNameMap();
    }

    @Test
    public void testBaeldung() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBaeldungBean collectionsBean = context.getBean(CollectionsBaeldungBean.class);
        collectionsBean.printBeanList();

    }


}
