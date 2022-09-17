package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for loop
		for (int i = 2; i < 10; i+=2) {
			//i++ birer artırır
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");
		
		//While
		int i=2;
		while(i<10) {
			System.out.println(i);
			//i++;
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//infinite loop : sonsuz döngü demektir
		
		//Do-While döngüsü
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		//Şart uymasa bile döngü en az 1 kere çalışır
		//Döngü çalışmasa da yapılmak istenen bir operasyon varsa yapmak için kullanılır.
		//Örneğin log atma
	}

}
