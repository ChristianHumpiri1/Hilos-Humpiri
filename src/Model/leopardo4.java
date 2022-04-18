package Model;

public class leopardo4 extends Thread{
	
	public leopardo4(String nombre) {
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
					Thread.sleep(1400);
				}catch (Exception e) {
					e.printStackTrace();
			   }
		     }
	
	       }
	}

}
