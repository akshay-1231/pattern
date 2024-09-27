package Pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int s = 5; // Starting value

	        // Outer loop for rows
	        for (int i = 0; i < 5; i++) {
	            // Inner loop for columns
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(s); // Print the current value of s
	            }
	            s--; // Decrease s after each row
	            System.out.println(); // Move to the next line after each row
	        }
      
           
	}

}
