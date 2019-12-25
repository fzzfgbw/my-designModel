package prototype;

import java.util.ArrayList;
import java.util.List;

public class Clone implements Cloneable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listCopy = new ArrayList<String>();
        list.add("zzz");
        list.add("ggg");
        listCopy = (ArrayList<String>) list.clone();
        for (String x :
                listCopy) {
            System.out.println(x);
        }

    }
}
