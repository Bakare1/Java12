package Iteration;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        for (int x = 0, y = 0; x < 3 && y < 3; ++x, ++y){
            System.out.println(x + " " + y);
        }
        /*for (int x = getInitialValue(), i = x == -2 ? x + 2 : 0, j = 0;
             i < 3 || j < 3 ; ++i, j = i) {
            System.out.println(i + " " + j);
        }*/

        //one dimentional arr
        String[] Name = {"Muhammed","Isaac","Micheal","Fuhad","ObaSeaman"};
        String[][] Fruits ={
                {"Banana","Mango"},
                {"PawPaw","Agbalumo"},
                {"Coconut","Cucumber"}
        };
        System.out.println(Arrays.stream(Name).toList().contains("Azeez"));
        System.out.println(Fruits[1][1]);
        System.out.println(Name[4]);
        for (int s = 0; s < 5; s++){
            System.out.println("Welcome to Java12 Class " + Name[s]);
        }
        //for-each loop
        for(String c : Name){
            System.out.println("Welcome to Java class " +c);
        }
        for (int a = 0; a < 3; a++){//0 1 2
            for (int b = 0; b < 2; b++){// 0 1
                System.out.print(Fruits[a][b]);
            }
        }
    }
}
