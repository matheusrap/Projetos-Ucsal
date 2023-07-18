import java.util.Scanner;

public class AppCharada {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);
		
		String mensagemBoasVindas = "Olá, seja bem vindo ao sistema de charadas!";
		
		String charada0 = "Cai em pé e corre deitado, quem sou eu ?";
		String charada1 = "O que o filho do matemático fala quando quer ir ao banheiro ?";
		String charada2 = "No meu jardim existe 3 pés de alface, 1 de pepino e 5 de cenoura. Quantos pés eu tenho no total ?";
		String charada3 = "Há 7 passarinhos em um galho de árvore. Um menino atira em um deles, quantos passarinhos sobraram no galho ?";
		
		boolean respostaCerta = false;
		
		do {
			System.out.println();
			System.out.println(mensagemBoasVindas);
			
			System.out.println();
			System.out.println("Digite 0, 1, 2 ou 3 para selecionar uma charada: ");
			String opcaoCharada = scanner.nextLine();
			
			switch (opcaoCharada) {
				case "0":
				System.out.println();
				System.out.println(charada0);
				String resposta0 = scanner.nextLine();
				
				if (resposta0.equals("chuva")) {
					System.out.println();
					System.out.println("Parabéns, você acertou !");
					respostaCerta = true;
				}else {
					System.out.println();
					System.out.println("Não foi dessa vez !");
				}
				break;
				case "1":
					System.out.println();
					System.out.println(charada1);
					String resposta1 = scanner.nextLine();
					
					if (resposta1.equals("pi-pi")) {
						System.out.println();
						System.out.println("Parabéns, você acertou !");
						respostaCerta = true;
					}else {
						System.out.println();
						System.out.println("Não foi dessa vez !");
					}
					break;
				case "2":
					System.out.println(charada2);
					String resposta2 = scanner.nextLine();
					
					if (resposta2.equals("2 pés")) {
						System.out.println();
						System.out.println("Parabéns, você acertou !");
						respostaCerta = true;
					}else {
						System.out.println();
						System.out.println("Não foi dessa vez !");
					}
					break;
				case "3":
					System.out.println(charada3);
					String resposta3 = scanner.nextLine();
					
					if (resposta3.equals("nenhum")) {
						System.out.println();
						System.out.println("Parabéns, você acertou !");
						respostaCerta = true;
					}else {
						System.out.println();
						System.out.println("Não foi dessa vez !");
					}
					break;
				default:
					break;
			}
		} while (!respostaCerta);
		
	}
}
