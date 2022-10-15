
public class Operadores {
	public static void main(String[] args) {
		
		int a, b;
		a = 6;
		b = 6;
		int numero1 = 1;
		int numero2 = 2;
		String nome1 = "Carol";
		String nome2 =  new String("Carol");
		boolean condicao1 = true;
		boolean condicao2 = false;
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1; // após ser detectada a primeira concatenação, assim serão lidos os operadores e não mais como adição
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1); // usando uma expressão de evidência será priorizada a expressão matemática e somente depois realizada a concatenação 
		System.out.println(concatenacao);
		
		String resultado = a == b ? "Verdadeiro" : "Falso"; // sintaxe de um operador ternário para uso em tipos booleans e cujo retorno pode ser String ou int
			System.out.println(resultado);
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 == numero2) {
			System.out.println("A nossa condição é verdadeira");
			
		}else {
			System.out.println("A nossa condição é falsa");
		}
		
		System.out.println("O numeroUm é igual ao numeroDois? " + simNao );
		
		simNao = numero1 != numero2;
		System.out.println("O numeroUm é diferente do numeroDois? " + simNao);
		
		simNao = numero1 > numero2;
		System.out.println("O numeroUm é maior que numeroDois? " + simNao);
		
		System.out.println(nome1 == nome2);
		
		System.out.println(nome1.equals(nome2));
		
		if (condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeiras");
		}
		if (condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}
		
		System.out.println("FIM");
	}
}
