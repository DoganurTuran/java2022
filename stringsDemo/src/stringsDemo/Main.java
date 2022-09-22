package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "   Bugün hava çok güzel.    ";
		System.out.println(mesaj);

		/*System.out.println("Eleman sayısı : " +mesaj.length());
		System.out.println("5. eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın")); //birleştirme
		System.out.println(mesaj.startsWith("b")); //büyük küçük harf duyarlı
		System.out.println(mesaj.endsWith("."));
		//char[] karakterler = new char[5];
		//mesaj.getChars( srcBegin: 0, srcEnd:5, karakterler, dstBegin: 0); // 0'dan başla, 1 eksiği elemanda bitir, array'e aktar, charın 0. elemanndan başlayarak aktar
		//System.out.println(karakterler); hata var
		System.out.println(mesaj.indexOf("av"));
		//System.out.println(mesaj.lastIndexOf(str: "e"));*/
		
		//String yeniMesaj = mesaj.replace(oldChar: ' ', newChar: '-'); hata
		//System.out.println(yeniMesaj); 
		//System.out.println(mesaj.substring(2,4)); 
		
		//for (String kelime : mesaj.split ( regex: " ")) { hata
			//System.out.println(kelime);
	
	System.out.println(mesaj.toLowerCase());
	System.out.println(mesaj.toUpperCase());
		
	}

}
