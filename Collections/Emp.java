package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Emp {
    private String name;
    private int age;
    private String designation;
    
    public Emp(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getage() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String toString() {
        return "Employee{" +
                "designation='" + designation + '\'' +
                ",name=" + name +
                ",age='" + age + '\'' +
                '}';
    }
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() !=o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age && name.equals(emp.name)&& designation.equals(emp.designation);
    }
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    public static void main(String[] args) {
        HashMap<Emp,Integer> map=new HashMap<Emp,Integer>();
        
        Emp e=new Emp("Ravi",31,"Mr. ");
        Emp e1=new Emp("Alok",26,"Mr. ");
        Emp e2=new Emp("Raj",29,"Mr. ");
        Emp e3=new Emp("Mahima",36,"Ms. ");
        Emp e4=new Emp("Alka",23,"Ms. ");
        
        map.put(e, 6000);
        map.put(e1, 2000);
        map.put(e2, 1000);
        map.put(e3, 15000);
        map.put(e4, 20000);
        
        for(Map.Entry<Emp,Integer> key:map.entrySet()) {
            System.out.println(key+ " Salary");
        }
    }

}
