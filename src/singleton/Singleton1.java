package singleton;

public class Singleton1 {
/*    (1)私有化该类的构造函数
            (2)通过new在本类中创建一个本类对象
(3)定义一个公有的方法，将在该类中所创建的对象返回*/

    /**
     * 饿汉
     */

    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}

/**
 * 懒汉式 双重校验锁
 */
class SingleTon2 {

    private static SingleTon2 instance;

    private SingleTon2() {

    }

    public static SingleTon2 getInstance() {
        if (instance == null) {
            synchronized (SingleTon2.class) {
                if (instance == null) {
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }


}


class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            SingleTon2 instance = SingleTon2.getInstance();
            System.out.println(instance);
        }
    }
}