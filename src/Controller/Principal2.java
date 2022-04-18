package Controller;

import Model.leopardo1;
import Model.leopardo2;
import Model.leopardo3;
import Model.leopardo4;

public class Principal2 {
	
	 public static void main(String[] args) {
		
		 leopardo1 l1 = new leopardo1("Diego");
		 leopardo2 l2 = new leopardo2("Rudy");
		 leopardo3 l3 = new leopardo3("Flash");
		 leopardo4 l4 = new leopardo4("Rappi");
		 l1.start();
		 l2.start();
		 l3.start();
		 l4.start();
	}
}
