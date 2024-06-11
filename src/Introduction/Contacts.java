package Introduction;

import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        HashMap mycontact = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Your Contacts");
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter Phone Number : ");
            String phone = sc.nextLine();
            mycontact.put(name, phone);
            System.out.println(mycontact);
            System.out.println(mycontact.size());
        }
    }
}
