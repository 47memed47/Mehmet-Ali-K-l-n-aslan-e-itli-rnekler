import java.util.Scanner;

public class grlnsyingtfmipztfmi {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("l�tfen bir say� giriniz");
		double sayi = reader.nextDouble();
		if(sayi<0) {
			System.out.println(sayi+" say�s� negatiftir");
		}
		if (sayi>0) {
			System.out.println(sayi+" say�s� pozitiftir ");
		}
		if (sayi==0) {
		 System.out.println(sayi+" say�s� s�f�rd�r");
		}
	}

}
