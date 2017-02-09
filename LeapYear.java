package basic.practice;

public class LeapYear {
		 public static void leapArea(int year){
		  if((year % 4 == 0)) {
			 System.out.println(year + ": Leap year.");
		  }else{
			 System.out.println(year + ": Not a leap year.");
		  }
		 }	
		 
		 public static void main(String args[]){ 


		  leapArea(2012); 
		 }
		}