package LAB11;

import java.awt.List;
import java.util.ArrayList;

public class Q3 {
	 public static void main(String[] args) {
	      ArrayList aList = new ArrayList();
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	      int index1 = aList.indexOf("C");
	      int index2 = aList.indexOf("S");
	      if(index1 == -1)
	         System.out.println("The element C is not in the ArrayList");
	      else
	         System.out.println("The element C is in the ArrayList at index " + index1);
	      if(index2 == -1)
	         System.out.println("The element S is not in the ArrayList");
	      else
	         System.out.println("The element S is in the ArrayList at index " + index2);
	   }

}
