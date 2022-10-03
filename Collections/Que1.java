package Collections;

	import java.util.ArrayList;
	import java.util.List;
	//import java.io.*;

	public class Que1 {

	    public static void main(String[] args) {
	           
	                List<Float> list = new ArrayList<>();
	                list.add(9.9f);
	                list.add(4.3f);
	                list.add(7.6f);
	                list.add(5.8f);
	                list.add(3.3f);
	                float sum=0.0f;
	                
	                for (int i = 0; i < list.size(); i++)
	                    
	                sum += list.get(i);
	                System.out.println("Sum = " + sum);
	            }
	    }


