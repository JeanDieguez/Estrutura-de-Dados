package Colevati.Exercicio10;

public class recursiva10main {
    public static void main(String[] args) {
        int numero1 = 18;
        int numero2 = 120;

        recursiva10modulo r = new recursiva10modulo();

        if(numero1 > numero2){
            System.out.printf("O MDC é: %d\n",r.mdc(numero1,numero2));  
        } else {
            System.out.printf("O MDC é: %d\n",r.mdc(numero2,numero1));    
        }     
    }    
}