package Colevati.Exercicio9;

public class recursiva9modulo {
	static int fatorialDuplo(int numero) {
		//ponto de parada, quando o numero chegar em 1.
		if(numero == 1) {
			return 1;
		} else {
			//chamada da proxima fun��o
			return numero * fatorialDuplo(numero - 2);
		}
	}
}