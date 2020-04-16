package factory.method;

import factory.simple.Human;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class Gay implements Human {
    @Override
    public void say() {
        System.out.println("断背山");
    }
}
