package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMı=false;
		for(int sayi : sayilar) {
			if (aranacak == sayi) { 
				/* System.out.println("Sayı bulundu");
				break;
			}else{
				System.out.println("Sayı bulunamadı");
		}*/
				varMı = true;
				break;
	}

} 		if(varMı) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
}
	}
