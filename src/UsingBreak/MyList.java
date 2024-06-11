package UsingBreak;

import java.util.List;

public class MyList {
    public static void main(String[] args) {
        String found = null;
        List<String> list = List.of("24", "42", "31", "2", "1","54");
        for (String s: list) {
            System.out.print(s + " "); //prints: 24 42 31
            if (s.contains("5")) {
                found = s;
                break;
            }
        }
        System.out.println("Found : " + found);

        int result = 0;
        List<List<Integer>> source = List.of(
                List.of(1, 2, 3, 4, 6),
                List.of(22, 23, 24, 25),
                List.of(32, 33)
        );
        cont: for(List<Integer> l: source){
            for (int i: l){
                if(i > 7){
                    result = i;
                    continue cont;
                }
            }
        }
        System.out.println("result=" + result);
    }
}
