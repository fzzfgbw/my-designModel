package factory.abstractFactory;

/**
 * @author: Guowei
 * 2020-04-15
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("少食多餐");
    }
}
