package inner;

public class AnonymousInnerClass {
    /**
     * 匿名内部类
     */
    public void dosomething() {
        new Thread(() -> {
            System.out.println("zzzzzzz");
            System.out.println(Thread.currentThread().getName());
        }, "zzz").start();
    }

    public static void main(String[] args) {
        new AnonymousInnerClass().dosomething();
    }
}
