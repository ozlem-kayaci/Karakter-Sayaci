import java.util.Scanner;

public class KarakterSayaci {

	public static void main(String[] args) {
		// Kullanıcıdan bir metin al ve her bir karakterin kaç defa geçtiğini say.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir metin giriniz: ");
		String metin = scanner.nextLine().toLowerCase();
		
		for(char c = 'a'; c <= 'z'; c++) {
			int sayac = 0;
			
			for(int i=0; i<metin.length(); i++) {
				if(metin.charAt(i) == c) {
					sayac++;
				}
			}
			if(sayac > 0) {
				System.out.println(c + " : " + sayac);
			}
		}
		scanner.close();
	}

}
