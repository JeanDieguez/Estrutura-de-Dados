public class recursiva7modulo {
	static int divisao(int dividendo,int divisor) {
		//ponto de parada, quando divisor for maior que o dividendo
		if(divisor > dividendo) {
			//envia resultado final da fun��o
			return dividendo;
		} else {
			//retorno da fun��o para a proxima chamada
			return divisao(dividendo - divisor,divisor);
		}
	}
}