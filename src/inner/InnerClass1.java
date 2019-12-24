package inner;
/*2.局部内部类*/
public class InnerClass1 {
    private  String x="";
    public  void getSomething(){
        class Inner{
            public void  printSomething(String s){
                System.out.println(s);

            }
        }
        new Inner().printSomething("zzz");

    }

    public static void main(String[] args) {
        new InnerClass1().getSomething();
    }

}
