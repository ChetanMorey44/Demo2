package Day04;

import java.util.*;

public class SwitchCase {
  public static void main(String[] args) {
	 
//	  int day=4;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Your date for Finding a day");
	  int day = sc.nextInt();
	  
	  switch(day) {
	  case 1:
		  System.out.println("Monday");
		  break;
	  case 2:
		  System.out.println("Tuesday");
          break;
	  case 3:
		  System.out.println("Wednesday");
		  break;
	  case 4:
		  System.out.println("Guruvar");
		  break;
	  case 5:
		  System.out.println("Friday");
		  break;
	  case 6:
		  System.out.println("shanivar");
		  break;
	  case 7:
		  System.out.println("Sunday");
		  break;
	  default:
		  System.out.println("Invalid Day !!");
	  
	  }
}
}
