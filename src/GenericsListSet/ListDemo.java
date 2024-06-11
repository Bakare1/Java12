package GenericsListSet;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Oba");
        myList.add("Fuad");
        System.out.println(myList);
        System.out.println(myList.contains("Micheal"));
        System.out.println(myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println("My name is " + myList.get(1));
    }
}
