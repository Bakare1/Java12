package YoungStarPolymorphy;

public class Student extends Person{
    private String name;
    private int StudentID;

    public Student(String name, int studentID) {
        super(name);
        this.name = name;
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentID=" + StudentID +
                '}';
    }

    public void studentDetails(){
        System.out.println("Student Sleeps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }
}
