public class recursiva7main {
	public static void main(String args[]) {
		int dividendo = 14;
		int divisor = 3;		
		recursiva7modulo r = new recursiva7modulo();
		
		System.out.printf("O resto da divisão é: %d\n",r.divisao(dividendo,divisor));
	}
}
