package GenericsListSet;

public class Employee {
    int empId;
    String empName;
    int salary;
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
    public Employee(int empId, String empName,int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }

}
