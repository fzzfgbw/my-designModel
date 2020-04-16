package factory.method;

import factory.abstractFactory.Animal;
import factory.abstractFactory.Pig;
import factory.simple.Human;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class GayFactory implements Factory {
    @Override
    public Human humanFactory() {
        return new Gay();
    }

    @Override
    public Animal AnimalFactory() {
        return new Pig();
    }

    public static void main(String[] args) {
        new GayFactory().humanFactory().say();
        new GayFactory().AnimalFactory().eat();
    }
}
