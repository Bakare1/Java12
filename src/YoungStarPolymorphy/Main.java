package YoungStarPolymorphy;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Ade",101);
        //Person p = new Student("Shade",102);
        st.studentDetails();
        st.personDetails();
        //((Student) p).personDetails();
        //((Student) p).studentDetails();
        System.out.println(st);

    }

}
