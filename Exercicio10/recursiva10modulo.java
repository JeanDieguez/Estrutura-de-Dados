package Colevati.Exercicio10;

public class recursiva10modulo {    
    static int mdc(int numeroMaior,int numeroMenor){
        // quando o número menor for 0 função para.         
        if(numeroMenor == 0){ 
            System.out.println(numeroMenor);
            return numeroMaior;    
        } else {      
            //chamada da proxima função, trocando o valor entre as variaveis da proxima função.
            System.out.println(numeroMenor);           
            return mdc(numeroMenor, numeroMaior % numeroMenor);             
        }              
    }    
}