package odev2;

class Mainn {

	public static void main(String[] args) {   	// TODO Auto-generated method stub

		
		 String[] sehirler1=new String[] {"ankara","izmir","istanbul"}	;
        
		 for(String sehir: sehirler1) {  // foreach döngüsü
			 
			 System.out.println(sehir);
		 }
		 
		 for (int i = 0 ; i<3 ;i++){ // klasik for
			 
			 System.out.println(sehirler1[0]);
		 }
	}

	

  //  public static void topla(int sayi1 , int sayi2) {
    	
    //	int toplam = sayi1 + sayi2;
    	//System.out.println("tolam : "+ toplam);  }
    	
// toplanan 2 sayının %10 hesaplama ; bu durumda 2 iş vardır 1. iki sayıyı toplamak 2. %10 alıp ekrna yazdırmak.
    
    //bu duurmda ;
    
    public static int topla(int sayi1 , int sayi2) {
    	int toplam = sayi1 + sayi2;
    	return toplam ; }
    	
    public static void yuzdeOnHesaplama (int sayi1 , int sayi2) {
    	int toplam = topla(sayi1, sayi2);
    	double sonuc = toplam * 10/100 ;
    	System.out.println("sonuç= " + sonuc);
    }
    
    public static double krediHesapla(double krediMiktari) {
    	
    	//hesaplar yapılır.
    	return 12560; }// bu sayıyı döndürür gibi
    
    // fonksiyonlar sadece integer string döndürmez
    
     // bir e ticaret sisteminde ürünlerin listelenmesi istenebilir. buda bir veri kaynağından gelir. yani
    //string int den ziyade listtede olabilir.
    }

  
   

