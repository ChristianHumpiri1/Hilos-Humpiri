package Model;

public class leopardo2 extends Thread{
	
	public leopardo2(String nombre) {
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
					Thread.sleep(1200);
				}catch (Exception e) {
					e.printStackTrace();
			   }
		     }
	
	       }
	}

}
