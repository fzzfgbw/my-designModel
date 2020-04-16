package factory.method;

import factory.abstractFactory.Animal;
import factory.simple.Human;

/**
 * @Description 工厂抽象接口
 * 简单工厂模式中的工厂类负责创建实例，那么如果有新的机型添加，就要修改工厂类，这样也不利于进一步松耦合。
 * 工厂方法模式中核心工厂类不负责所有实例的创建，而是将具体的创建工作交给了子类去完成，这个核心类成为了一个抽象工厂角色
 * @Author guo wei
 * @Date 14:07 2020/4/15
**/
public interface Factory {
    Human humanFactory();
    Animal AnimalFactory();
}
