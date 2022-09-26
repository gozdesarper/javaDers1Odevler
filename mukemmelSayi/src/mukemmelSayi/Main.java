package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
	// 6 / 1,2,3 toplamları 6 ediyor
	// 28 /1,2,4,7,14 toplamları 28 mükemmel sayıdır.
		
		int number = 1;
		int total = 0;
	
		for (int i=1 ; i<number ; i++) {
			if(number % i == 0) {
				total = total +i;
		}
		}
			if(total==number) {
				System.out.println("sayı mukemmel sayıdır");}
			
		    else {
			System.out.println("sayı mukemmel sayı değildir.");}
		
	}
}


