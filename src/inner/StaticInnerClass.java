package inner;

public class StaticInnerClass {
//    静态内部类也是定义在另一个类里面的类，只不过在类前加上了static。静态内部类是不需要依赖于外部类的，与静态成员变量类似。
    static class Inner{
        public  void go(){
            System.out.println("???");
        }
    }

    public static void main(String[] args) {
        Inner si=new Inner();
       si.go();
    }
}
class test{
    public static void main(String[] args) {
        StaticInnerClass.Inner si=new StaticInnerClass.Inner();
        si.go();
    }
        }
