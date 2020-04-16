package factory.method;

import factory.abstractFactory.Animal;
import factory.simple.Human;
import factory.simple.Man;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class ManFactory implements Factory {
    @Override
    public Human humanFactory() {
        return new Man();
    }

    @Override
    public Animal AnimalFactory() {
        return null;
    }

    public static void main(String[] args) {
        Factory factory = new ManFactory();
        factory.humanFactory().say();
    }
}
