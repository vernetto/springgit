package org.pierre.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

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

}
