package Model;

import java.util.Scanner;

public class Factorial extends Thread{

	public static int numero;
	public static long resultado;
	public static int i;

   public Factorial(int i,int numero, long resultado) {
       this.numero=numero;
       this.resultado=resultado;
   }

   public synchronized void factorial() {
       for(i=Factorial.i; i<=numero; i++ ) {
           System.out.println(i   +"x" +resultado);
           resultado= resultado*i;
       }
       System.out.println(resultado);
   }

   public void run() {
   	for(i=Factorial.i; i<=numero; i++ ) {
           System.out.println(i   +"x" +resultado);
           resultado= resultado*i;
       }
       System.out.println(resultado);
   }   
   
   
   public static void main (String[]args ) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Factorial del numero: ");
       numero = sc.nextInt();
       Factorial hilo1 = new Factorial(i=1,(numero ), resultado=1);
       hilo1.start(); 
      
   }
	    
	    
	
	

}
