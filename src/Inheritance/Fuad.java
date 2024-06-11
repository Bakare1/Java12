package Inheritance;

public class Fuad extends Person {
    void Complextion(){
        System.out.println("I am dark in complexion");
    }
    public static void main(String[] args) {
        Fuad f = new Fuad();
        f.Complextion();
        f.Age(20);
        f.Gender("Male");
    }
}
