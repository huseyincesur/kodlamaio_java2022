package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Hüseyin";
		String ogrenci2 = "Rümeysa";
		String ogrenci3 = "Tuna";
		String ogrenci4 = "Sevil";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("----------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Hüseyin";
		ogrenciler[1]="Rümeysa";
		ogrenciler[2]="Tuna";
		ogrenciler[3]="Sevil";
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("----------------");
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
	}

}
