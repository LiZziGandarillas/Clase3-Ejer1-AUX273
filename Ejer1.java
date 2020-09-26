import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		int x = 0;
		Scanner leer = new Scanner(System.in);
		while(x<10000 || x>99999)
		{
			x=leer.nextInt();
		}
		int r=x%100;
		x=x/100;
		int d=x%10;
		x=x/10;
		x=(d*10000+(x*100+r))*10+d;
		System.out.println(x);
	}
}
