package methods2;

public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = topla(48,98);
		System.out.println(sayi);
		int toplam = topla2(2,5,2,5,7,4,3,2,66);
		System.out.println(toplam);

	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	public static int topla2(int... sayilar) {
		int toplam =0;
		for (int sayi:sayilar) {
			
			toplam+=sayi;
		}
		return toplam;
	}

}
