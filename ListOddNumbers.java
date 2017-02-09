package basic.practice;

public class ListOddNumbers {

public static int listOddNumber(int aNumber){
			
System.out.println("Odd numbers between 1 and " + aNumber + ":");
	               for(int i=1; i <= aNumber; i++){               
	                  if( i % 2 != 0){
	                    System.out.println(i);
	                  }
	               }
				return aNumber;
		}
	 
	 
		public static void main(String args[]){ 
			
			listOddNumber(10); 
		}
	}

