package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 23;
		int remainder = number % 2; //kalanı söyler % mod operatörü
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
		}
		
		for (int i=2; i<number; i++) {
			if(number % 1 == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
			
		}
	

}
