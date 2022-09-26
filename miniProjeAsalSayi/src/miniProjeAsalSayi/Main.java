package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = 1 ; // 2 yazdığımızda for döngüsüne girmediğimiz için direk true kabul edecek sayı asaldır yazacak.
	
		boolean isPrime = true;
		// sistemdeki özel duurmlar için bug lar için 1 mesela asal değildir ama asal yazıyor bu durumlar için özel şeyler yazmalıyız.
		
		if(number==1) {
			System.out.println("sayı asal değildir.");
		   return; // peşin peşin bitiriyor return olmaz ise aşağıdaki if de çalışıyor.
		}
		for (int i=2;i<number;i++) {
			
			if(number % i == 0) {
				isPrime = false;
			}
		}
			if(isPrime) {
				System.out.println("sayı asaldır");}
			else {
					System.out.println("sayı asal değildirr");}
					
				}
			}
		


