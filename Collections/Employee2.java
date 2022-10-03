package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Employee2 implements Comparator {
    private String fname;
    private String lname;
    private double age;
    private int salary;
    
    
    public Employee2(String fname,String lname,double age,int slary) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.salary = salary;
    }
    
    public static final Comparator<Employee2> Firstname = new Comparator<Employee2>(){
         
        public int compare(Employee2 o1, Employee2 o2) {
            return o1.fname.compareTo(o2.fname);
        }
    };
    
    public static final Comparator<Employee2> SalaryComparator = new Comparator<Employee2>() {
        
        public int compare(Employee2 e1, Employee2 e2) {
            return (e1.salary- e2.salary);
        }
    };
    
    
    public String toString() {
        return "Employee2 [fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary=" +  salary + "]";
    }
    
    
    public int hashCode() {
        return Objects.hash(age, fname, lname, salary);
    }
    
    
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Employee2 other = (Employee2) obj;
        return Double.doubleToLongBits(age) == Double.doubleToLongBits(other.age) && Objects.equals(fname,  other.fname)
                && Objects.equals(lname,  other.lname) && salary == other.salary;
        
    }
    
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Ravi", "Gupta", 28, 15000);
        Employee2 emp1 = new Employee2("Vinay", "Chaurasiya", 27, 29000);
        Employee2 emp2 = new Employee2("Alok", "Pandey", 29, 50500);
        Employee2 emp3 = new Employee2("Deepak", "Kumar", 32, 38000);
        Employee2 emp4 = new Employee2("Mahima", "Aggrawal", 33, 600000);

        ArrayList<Employee2> li = new ArrayList<Employee2>();
        li.add(emp);
        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        li.add(emp4);
        Collections.sort(li,SalaryComparator);
        for(Employee2 em:li) {
            System.out.println(em);
        }
    }
    public int compare(Object o1, Object o2) {
        
        return 0;
    }
}