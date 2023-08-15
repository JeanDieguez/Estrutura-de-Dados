public class recursiva8modulos {
	static int soma = 0;
	static int somaVetor(int vetor[],int tamanho) {
		//condi��o de parada, quando o indice do vetor chegar em 0.
		if(tamanho == 0) {
			return soma;
		} else {
			//verifica se o conte�do do vetor � par ou impar, se for par adiciona + 1 na variavel soma.
			if(vetor[tamanho-1] % 2 == 0) {
				soma = soma + 1;
				return somaVetor(vetor,tamanho-1);
			} else {
				return somaVetor(vetor,tamanho-1);
			}
		}		
	}
}