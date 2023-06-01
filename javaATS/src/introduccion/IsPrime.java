package introduccion;
// Checks which numbers within a range are prime numbers
public class IsPrime {
	public static void main(String[] argv){
		
		for (int i = 450; i < 600; i++) {
			
			//Iterate through each value to check if its prime
			boolean itsPrime = true;
			for (int j = 2; j <= i/2; j++) {
				
				//if i can be divided by 1, then it is not a prime number
				
				if (i % j == 0) {
					itsPrime = false;
					break;
				}
			}
			
			//Now we print the prime numbers
			if (itsPrime) {
				System.out.println(i);
					}
			
			
			
		}
	}
}
