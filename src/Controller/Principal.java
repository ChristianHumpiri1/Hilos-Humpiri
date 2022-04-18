package Controller;

import Model.Ascendente;
import Model.Descendentes;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException{
        Ascendente  par= new Ascendente();
        Descendentes impar =new Descendentes();
     par.start();
     Thread.sleep(2000);
     impar.start();
 }

}
