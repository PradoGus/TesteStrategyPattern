
public class Teste {

	public static void main(String[] args) {
		
		Calculador calc = new Calculador();
		Quadrado quad = new Quadrado();
		Triangulo tri = new Triangulo();
		quad.lado = 2;
		tri.altura = 1;
		tri.base = 2;
		tri.lado = 2;
		
		
		System.out.println("\nEsta � a �rea do quadrado: "+calc.calcula(quad));
		System.out.println("\nEsta � a �rea do triangulo: "+calc.calcula(tri));

	}

}
