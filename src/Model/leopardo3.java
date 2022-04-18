package Model;

public class leopardo3 extends Thread {

	
	public leopardo3(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <=30 ; i++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "corrio "+i+ "km");
			if (i%10==0) {
				try {
					Thread.sleep(1300);
				}catch (Exception e) {
					e.printStackTrace();
			   }
		     }
	
	       }
	}
}
