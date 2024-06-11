package GenericsListSet;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(1001,"Steven",89000));
        employeeList.add(new Employee(1003,"Harry",56000));
        employeeList.add(new Employee(1004,"Moses",96000));
        employeeList.add(new Employee(1002,"Masih",44000));
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
        System.out.println("*".repeat(20));
        Collections.sort(employeeList,new EmpSalarySort()) ;
        for(Employee employee:employeeList){
            System.out.println(employee);
        }

    }
}
