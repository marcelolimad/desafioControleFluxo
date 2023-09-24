import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite um nuemro para parametro UM: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite um nuemro para parametro DOIS: ");
		int parametroDois = terminal.nextInt();
		
		
		try {
			
			//chamando o metado contendo a lógica de contagem
			contar(parametroUm,parametroDois);
			
			
		}catch(ParametrosInvalidosException e) {
			System.out.println(" O segundo parâmentro deve ser maior que o primeiro");
		}
		
	}
	
	
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
			
			if(parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
				
			}
			int contagem = parametroDois - parametroUm;
			
			for (int i = 0; i < contagem; i++ ) {
				System.out.println(contagem);
			}
				
				
			
				// realizar o for para imprimir os numeros com a base na variável contagem
		}
		
		
		
		
		
	
	

}
