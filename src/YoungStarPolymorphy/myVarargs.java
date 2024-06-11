package YoungStarPolymorphy;

public class myVarargs {
    private static String doSomething(String str,int i, double...arr){
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + str);
        return str;
    }

    public static void main(String[] args) {
        doSomething("Ade",42,10,17.23,4,2.40);
    }
}
