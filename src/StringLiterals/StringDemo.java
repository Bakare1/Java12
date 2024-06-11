package StringLiterals;

public class StringDemo {
    public static void main(String[] args) {
        String str1="Vinod";
        System.out.println(str1);
        System.out.println("Length of str1:"+str1.length());
        //String literal is also an object
        System.out.println("HelloWorld".length());
        String s1="xyz";
        String s2="xyz";
        if(s1==s2){
            System.out.println("Both Strings are Equal");
        }
        else{
            System.out.println("Both Strings are Unequal");
        }
        String x1=new String("xyz");
        String x2=new String("xyz");
        if(x1==x2){
            System.out.println("Both Strings are Equal");
        }
        else{
            System.out.println("Both Strings are Unequal");
        }
    }
}

