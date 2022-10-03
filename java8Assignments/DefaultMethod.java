package java8Assignments;

interface Inherit
{
    default void display()
    {   System.out.println("Welcome");
    }
    }
interface Inherit1
{  
    default void display()
    {   System.out.println("This is");
    }
    }
interface Inherit2 {
    default void display()
    {   System.out.print("Test");
    }
    }
public class DefaultMethod implements Inherit,Inherit1,Inherit2 {
    public void display()
    {
        System.out.println("Default Method");
        Inherit.super.display();
        Inherit1.super.display();
        Inherit2.super.display();
    }
    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.display();    
    }
}

