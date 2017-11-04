import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1 ;
		
		System.out.println(randomNumber);
		
		if(randomNumber >6){
			System.out.println("You're lucky today!");
			
		}else{System.out.println("You lost!");
		}
		
	}
	
}
