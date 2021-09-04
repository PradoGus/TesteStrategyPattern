
/**
 * 
 * @author Gustavo Prado
 *
 *Essa classe faz um cálculo da área de uma figura plana
 *
 *Agora o exemplo usando o pattern strategy
 *
 */

public class Calculador {
	
	double resultado;
	
	public double calcula(Figura figura) {
		
		return figura.calcArea();
		
	}
}
