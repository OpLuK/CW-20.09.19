import java.util.Scanner;
public class kalendar {
	public static void main (String[]args) {
		System.out.print("Введите номер (1-12) года по старояпонскому календарю: ");
		Scanner in = new Scanner (System.in);
		int year = in.nextInt();
		in.close();
		switch (year) {
		case 1:
			System.out.println("Это год крысы.");
			break;
		case 2:
			System.out.println("Это год коровы.");
			break;
		case 3:
			System.out.println("Это год тигра.");
			break;
		case 4:
			System.out.println("Это год зайца.");
			break;
		case 5:
			System.out.println("Это год дракона.");
			break;
		case 6:
			System.out.println("Это год змеи.");
			break;
		case 7:
			System.out.println("Это год лошади.");
			break;
		case 8:
			System.out.println("Это год овцы.");
			break;
		case 9:
			System.out.println("Это год обезьяны.");
			break;
		case 10:
			System.out.println("Это год курицы.");
			break;
		case 11:
			System.out.println("Это год собаки.");
			break;
		case 12:
			System.out.println("Это год свиньи.");
			break;
		default :
			System.out.println("В старояпонском календаре 12-летний цикл.");
		}
	}
}
