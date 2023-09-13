import java.util.Scanner;

public class App {
   
      
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;

	
		System.out.println("Por favor, digite o número da Conta: ");
		numeroConta = sc.nextInt();

		System.out.println("Agora digite o número da Agência:");
		agencia = sc.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("informe seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println("Seu numero de conta é " + numeroConta);
		
		System.out.println("Seu numero de agencia é " + agencia);
		
		System.out.println("Seu nome é " + nomeCliente);
		
		
		System.out.println("Seu saldo é " + saldo);
		sc.close();
		
		
	
    }
}
