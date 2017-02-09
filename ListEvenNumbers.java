package basic.practice;

public class ListEvenNumbers {

public static int listEvenNumber(int aNumber){
			
System.out.println("Even numbers between 1 and " + aNumber + ":");
	               for(int i=1; i <= aNumber; i++){               
	                  if( i % 2 == 0){
	                    System.out.println(i);
	                  }
	               }
				return aNumber;
		}
	 
	 
		public static void main(String args[]){ 
			
			listEvenNumber(10); 
		}
	}

