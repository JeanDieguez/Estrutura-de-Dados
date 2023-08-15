public class recursiva8main{
	public static void main(String args[]) {
		int vetor[] = {10,9,5,8,7,2};
		int tamanho = vetor.length;
		recursiva8modulos r = new recursiva8modulos();
		
		System.out.printf("A quantidade de numero pares no vetor são: %d\n",r.somaVetor(vetor,tamanho));		
	}
}