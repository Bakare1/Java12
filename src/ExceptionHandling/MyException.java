package ExceptionHandling;

public class MyException {
    public static void main(String[] args){
        int x = 11;
        try {

            if(x > 10){
                throw new RuntimeException("The x value is out of range: " + x);
            }

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }finally {
            //System.out.println(x + " is less than 10");
        }

    }
}
