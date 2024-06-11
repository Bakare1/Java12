package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int x = 5;
        String name = "Ade";
        String names = "Ade";
        System.out.println(x % 2);
        System.out.println(x / 2d);
        System.out.println(x - 2);
        System.out.println(x + 2);
        System.out.println(x * 2f);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x += 2);
        System.out.println(x *= 2);
        System.out.println(x %= 2);
        System.out.println(x -= -2);
        System.out.println(name == names);
        String o1 = new String("Ade");
        String o2 = new String("Ade");
        System.out.println(o1 != o2);

    }
}
