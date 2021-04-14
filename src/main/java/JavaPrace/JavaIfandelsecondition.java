package JavaPrace;

public class JavaIfandelsecondition {

	public static void main(String[] args) {
 
//		 //defining an 'age' variable  
//	    int age=20;  
//	    //checking the age  
//	    if(age>18){  
//	        System.out.print("Age is greater than 18");  
//	}

		//A Java Program to demonstrate the use of if-else statement.  
		//It is a program of odd and even number.  

//	    //defining a variable  
//	    int number=13;  
//	    //Check if the number is divisible by 2 or not  
//	    if(number%2==0){  
//	        System.out.println("even number");  
//	    }else{  
//	        System.out.println("odd number");  
//	    }  
		//Leap Year Example:

		//A year is leap, if it is divisible by 4 and 400. But, not by 100.
	    int year=2020;    
	    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");  
	    }  
	    else{  
	        System.out.println("COMMON YEAR");  
	    }  
}
}
