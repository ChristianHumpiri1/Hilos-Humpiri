package Model;

public class Descendentes extends Thread{
	
	@Override
    public void run(){
        for (int i = 10; i > 0; i--) {
        System.out.println(i);
    }
        System.out.println("Descendente");
    }

}
