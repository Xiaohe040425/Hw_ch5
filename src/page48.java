class page48 extends Thread{
    public static void main(String[] args) {
        P48Car car1 = new P48Car("1號車");
        car1.start();

            
        try {
    		car1.join();
    	}catch(InterruptedException e) {
    		
    	}
        System.out.println("結束main()的處理工作");
        
    }
}

class P48Car extends Thread {
    private String name;

    public P48Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	System.out.println("正在進行" + name + "的處理工作");
            
        }
    }
}
