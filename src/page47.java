class page47 extends Thread{
    public static void main(String[] args) {
        P47Car car1 = new P47Car("1號車");
        car1.start();

        for (int i = 0; i < 5; i++) {
            
            try {
        		sleep(1000);
        		System.out.println("正在進行main()的處理工作");
        	}catch(InterruptedException e) {
        		
        	}
        }
    }
}

class P47Car extends Thread {
    private String name;

    public P47Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	System.out.println("正在進行" + name + "的處理工作");
            
        }
    }
}
