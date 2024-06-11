package UsingBreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        HashMap<String,String> contact = new HashMap<>();
        mylist.add("Micheal");
        mylist.add("Anayo");
        mylist.add("Fuad");
        contact.put("Fuad","08033007254");
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.get(1));
        System.out.println(mylist.contains("Fuad"));
        System.out.println(mylist.isEmpty());
        System.out.println(contact.get("Fuad"));
    }
}
