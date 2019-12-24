package inner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
/*1.成员内部类*/
public class InnerClass {
    private String x="dsfsd";
      class  Inner{
        private    String x="ccc";
        private    String  zzz(){
            System.out.println("zzz");
            return "zzz";
        }

    }

    public static void main(String[] args) {
        System.out.println(new InnerClass().new Inner().x);
    }
}
