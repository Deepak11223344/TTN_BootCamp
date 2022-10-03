package java8Assignments;

public class Ques1
{
    public static void main(String[] args)
    {
        concatenation c=(String a,String b)->a+b;
        System.out.println(c.concat("Fri", "day"));
        
        greater g=(int a,int b)->{if(a>b) return true; else return false;};
        System.out.println(g.max(10,8));
        
        increment i=(int a)-> ++a;
        System.out.println(i.inc(1));
        
        convertupper u=(String a)->a.toUpperCase();
        System.out.println(u.convert("Aero Plane"));
        }
    }
interface concatenation{
    String concat(String a,String b);
}
interface greater{
    boolean max(int a,int b);
}
interface increment{
    int inc(int a);
}
interface convertupper{
    String convert(String a);
}