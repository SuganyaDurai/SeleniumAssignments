package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	
	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	
	public static void main(String[] args) {
		String test = "changeme";
		// Convert the String to character array
		char[] name = test.toCharArray();
		//int length = name.length;		
		
		System.out.println("Odd index are: ");
		
		//Traverse through each character (using loop)
		for (int i = 0; i< name.length; i++) {			
			
//find the odd index within the loop (use mod operator)
			if (i%2!= 0) {
				char upperCase = Character.toUpperCase(name[i]);
				System.out.print(upperCase);
				
			}
			else {
				
					char str=name[i];
					System.out.print(name[i]);
					
			}
			
			
		}
		

	}
}
