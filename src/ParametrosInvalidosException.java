
public class ParametrosInvalidosException  extends Exception{
	
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
			
		}
		
		// validar se parametroUM é MAIOR que parametroDois e lançar exceção
		
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os numeros com a base na variável contagem
		for (int i = 0; i < contagem; i++ ) {
			System.out.println(contagem);
		}
		
	}
	

}
