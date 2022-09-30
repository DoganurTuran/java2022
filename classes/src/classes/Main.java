package classes;

public class Main {

	public static void main(String[] args) {
		//referance type
		CustomerManager customerManager = new CustomerManager ();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); //sayı1in değeri 10 verilmiş sayı2 sayı1e eşitse sayı 2 10 olarak yazdırılır önceki atanan değer geçerlidir
		System.out.println();
		
		int[] sayılar1 = new int[] {1,2,3};
		int[] sayılar2 = new int[] {4,5,6}; 
		sayılar2 = sayılar1;
		sayılar1[0]=10;
		System.out.println(sayılar2[0]);
}

}