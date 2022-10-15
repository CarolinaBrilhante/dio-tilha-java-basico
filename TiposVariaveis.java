
public class TiposVariaveis {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String meuNome = "Anna Carolina Brilhante"; // o tipo está com a primeira letra maiúscula pois não é um tipo primitivo e sim um Generics
		
		double slarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		int numero =5;
		
		numero =10; // sintaxe de variável
		
		System.out.println(numero);
		
		final double VALORDEPI = 3.14; // sintaxe de uma constante
	}
}
