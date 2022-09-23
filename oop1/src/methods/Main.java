package methods;

public class Main {

	public static void main(String[] args) {
//		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
//		int aranacak = 6;
//		boolean varMi = false;
//		
//		for (int sayi : sayilar) {
//			if(sayi==aranacak) {
//				varMi = true;
//				break;
//			}
//		}
//		
//		if(varMi) {
//			System.out.println("Sayi mevcuttur");
//		} else {
//			System.out.println("Sayı mevcut değildir");
//		}
//	
		sayiBulmaca();
	}
	
	//parametresiz method
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
//		if(varMi) {
//			System.out.println("Sayi mevcuttur : " + aranacak);
//		} else {
//			System.out.println("Sayı mevcut değildir : " + aranacak);
//		}
		
		String mesaj="";
		if(varMi) {
		mesajVer("Sayi mevcuttur : " + aranacak);
		} else {
		mesajVer("Sayı mevcut değildir : " + aranacak);
		}
		
	}
	
	//parametreli method
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);		
	}
	
}

