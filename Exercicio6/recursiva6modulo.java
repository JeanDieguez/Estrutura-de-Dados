public class recursiva6modulo {
	static int multiplicaoSoma(int a, int b) {
		// ponto de parada, quando a variavel B chegar em 0
		if(b == 0) {
			return 0;
		}else {
		// chamada da proxima fun��o
			return a + multiplicaoSoma(a, b-1);			
		}
	}
}