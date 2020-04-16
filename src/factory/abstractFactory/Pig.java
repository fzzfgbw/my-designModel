package factory.abstractFactory;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class Pig implements Animal {
    @Override
    public void eat() {
        System.out.println("先拱在吃");
    }
}
