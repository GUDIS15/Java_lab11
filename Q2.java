package LAB11;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
	 public static void main(String[] args) 
	    {
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
	         
	        System.out.println(namesList);  //list size is 3
	         
	        //Add element at 0 index
	        namesList.set(0, "Lokesh");
	         
	        System.out.println(namesList);  //list size is 3
	    }

}
