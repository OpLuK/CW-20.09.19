import java.util.Scanner;
public class kalendar {
	public static void main (String[]args) {
		System.out.print("Введите номер года: ");
		Scanner in = new Scanner (System.in);
		int year_n = in.nextInt();
		in.close();
		int year_k = year_n % 12;
		switch (year_k) {
		case 4:
			System.out.println("Это год крысы.");
			break;
		case 5:
			System.out.println("Это год коровы.");
			break;
		case 6:
			System.out.println("Это год тигра.");
			break;
		case 7:
			System.out.println("Это год зайца.");
			break;
		case 8:
			System.out.println("Это год дракона.");
			break;
		case 9:
			System.out.println("Это год змеи.");
			break;
		case 10:
			System.out.println("Это год лошади.");
			break;
		case 11:
			System.out.println("Это год овцы.");
			break;
		case 0:
			System.out.println("Это год обезьяны.");
			break;
		case 1:
			System.out.println("Это год курицы.");
			break;
		case 2:
			System.out.println("Это год собаки.");
			break;
		case 3:
			System.out.println("Это год свиньи.");
			break;
		}
	}
}
