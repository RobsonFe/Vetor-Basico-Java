package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = leia.nextInt();
		
		double[] vect = new double[n];
		//Eu crio um vetor quando eu "[]" declarando a variavel double 
		// no "vect = new double []" eu coloco o numero de posições do meu vetor neste caso será "n" posições.
		
		for(int i=0; i<n; i++) {
			vect[i] = leia.nextDouble();
		}
		//Eu faço um laço para pecorrer o vetor, enquanto o laço for menor do que "n"/ou a posição do vetor.
		// i++ significa que será uma incrementação 
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma/n;
		
		System.out.printf("A media do vetor é: %.2f%n", media);
		//Neste caso, eu coloquei um "printf" (referencia a linguagem C) para para poder editar o numero de casas decimais.
		// "%.2f%n" esse numero 2 significa o numero de casas decimais que eu quero que seja impresso no resultado.
		
		
		leia.close();
	}

}
