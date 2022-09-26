package creditManager;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		creditManager creditmanager = new creditManager();
			creditmanager.calculate();
			creditmanager.add();
		mortgageManager morgagemanager = new mortgageManager();
			morgagemanager.calculate();
		vehicleManager	vehiclemanager = new vehicleManager();
			vehiclemanager.calculate();
		creditManager[] credits = new creditManager[2];
			credits[0] = new mortgageManager(); // artık credits[0] new lediğimiz için morgage tutuyor.
			credits[1] = new vehicleManager(); // creditManger 2 elemanı var. morgage ve vehicle
		for (int i = 0; i < credits.length; i++) {
			credits[i].calculate(); // 0. elemandan başlayıp tüm elemanlar için calculate fonk çalıştırdı.
		}
}
	
}