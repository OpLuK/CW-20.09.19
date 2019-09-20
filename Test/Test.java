import java.util.Scanner;
public class Test {
	public static void main (String[]args) {
		int summ = 0;
		Scanner in = new Scanner(System.in);
		switch (summ) {
		case 0 :
		int num1 = (int) (Math.random()*9);
		int num2 = (int) (Math.random()*9);
		int div1 = num1 * num2;
		System.out.print("Чему равно произведение: " + num1 + " * " + num2 + " = ");
		int div_1 = in.nextInt();
		if (div_1 == div1) {
			summ += 1;
		}
		case 1 :
		int num3 = (int) (Math.random()*9);
		int num4 = (int) (Math.random()*9);
		int div2 = num3 * num4;
		System.out.print("Чему равно произведение: " + num3 + " * " + num4 + " = ");
		int div_2 = in.nextInt();
		if (div_2 == div2) {
			summ += 1;
		}
		case 2 :
		int num5 = (int) (Math.random()*9);
		int num6 = (int) (Math.random()*9);
		int div3 = num5 * num6;
		System.out.print("Чему равно произведение: " + num5 + " * " + num6 + " = ");
		int div_3 = in.nextInt();
		if (div_3 == div3) {
			summ += 1;
		}
		case 3 :
		int num7 = (int) (Math.random()*9);
		int num8 = (int) (Math.random()*9);
		int div4 = num7 * num8;
		System.out.print("Чему равно произведение: " + num7 + " * " + num8 + " = ");
		int div_4 = in.nextInt();
		if (div_4 == div4) {
			summ += 1;
		}
		case 4 :
		int num9 = (int) (Math.random()*9);
		int num10 = (int) (Math.random()*9);
		int div5 = num9 * num10;
		System.out.print("Чему равно произведение: " + num9 + " * " + num10 + " = ");
		int div_5 = in.nextInt();
		if (div_5 == div5) {
			summ += 1;
		}
	}
		in.close();
		if (summ >= 2) {
		System.out.println("Ваша оценка: " + summ);
		}
		else {System.out.println("Ваша оценка: 2");}
}
}