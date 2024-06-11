package Introduction;

public class UsingReturn {
        String returnDemo(int i){
            if(i < 10){
                return "Not enough";
            } else if (i == 10){
                return "Exactly right";
            } else {
                return "More than enough";
            }
        }

    public static void main(String[] args) {
        UsingReturn ur = new UsingReturn();
        System.out.println(ur.returnDemo(11));
    }
}
