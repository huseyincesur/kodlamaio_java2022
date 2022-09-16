package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		//değişken isimleri javada camelCase yazılır.
		String ortaMetin ="İlginizi Çekebilir";
		String altMetin ="Vade Süresi";
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.20;
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		} else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {"A kredisi", "B kredisi","C kredisi"};
		
		//1.yol
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("-----------------");
		//2.yol
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
