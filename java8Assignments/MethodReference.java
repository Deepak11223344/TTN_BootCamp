package java8Assignments;

public class MethodReference {
    
    static void display()
    {
        int a=3;
        int b=2;
        int mul=a*b;
        System.out.println("Static method multiplication: "+mul);
    }
    void display2()
    {
        int a=4;
        int b=7;
        int sum = a+b;
        int sub = a-b;
        System.out.println("Instance add method return sum: "+sum+" and returns substraction: "+sub);
    }
    public static void main(String[] args) {
    MethodReferenceInterface methodreferenceinterface = MethodReference::display;
    methodreferenceinterface.print();
    
    MethodReference methodreference = new MethodReference();
    
    MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
    methodreferenceinterface1.print();
    }
}
interface MethodReferenceInterface{
    void print();
}