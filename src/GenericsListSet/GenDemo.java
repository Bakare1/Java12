package GenericsListSet;

import java.util.ArrayList;
import java.util.List;

public class GenDemo {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        GenDemo g = new GenDemo();
    }

}
