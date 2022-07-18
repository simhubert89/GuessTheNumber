
public class Program {

	public static void main(String[] args) {
		//Predict(23, 0, 100);
		PredictByBruteForce(23, 0, 100);
	}
	
	// 1st method
	/**
	 * DIVIDE AND RULE
	 * Most effective search between the 2.
	 * @param nb = predicted number
	 * @param lower = it's the lower border of search space.
	 * @param sup = it's the upper border of search space.
	 */
	
	public static void Predict(int nb, int lower, int sup) {
		int i = 0; 	// number of steps to predict number
		int median; 	//median's position
		
		System.out.println("\nBeeBop, guess the number between " + lower + " and " + sup + "!");
		
		do {
			
			System.out.println("\nSteps " + ++i + ": Search space: between " + lower + " and " + sup);
			median = (lower + sup) / 2;
			
			System.out.println("Was the number greater than " + median + "?");
			
			if(nb>median) {
				System.out.println("Yes.");
				lower = median + 1;
			} // nb <= median
			else {
				System.out.println("No.");
				sup = median;
			}
			
			
		} while(lower != sup); 	// as long as borders don't collapse
	}
	
	// 2nd method
	/**
	 * BRUTE FORCE
	 * Not an effective search
	 * @param nb
	 * @param lower
	 * @param sup
	 */
	public static void PredictByBruteForce(int nb, int lower, int sup) 
	{
		System.out.println("\nBeeBop, guess the number between " + lower + " and " + sup + "!");
		
		for(int i = lower; i <= sup; i++) {
			System.out.println("\nStep " + (i+1) + ": Was the number " + i  + "?");
			
			if( i != nb)
				System.out.println("No.");
			else
			{
				System.out.println("Yes.");
				break;
			}
		}
		
	}
	
	// THANKS FOR WATCHING <3

}
