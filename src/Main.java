import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("digite um Nome: ");
		String name = scan.next();

		System.out.println("Digite a idade: ");
		int x = scan.nextInt();

		System.out.println("digite um numero: ");
		double y = scan.nextDouble();		

		System.out.printf("Olá o %s é louco, ele tem  %d anos e tem  %.1f namoradas! %n", name, x, y);
		
		scan.close();
	}

}
