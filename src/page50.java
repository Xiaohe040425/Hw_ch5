class page50 {
    public static void main(String[] args) {
        P50Car car1 = new P50Car("1號車");
        Thread th1 = new Thread(car1);
        th1.start();

        for (int i = 0; i < 5; i++) {
            
        	System.out.println("正在進行main()的處理工作");
        	
        }
    }
}

class P50Car implements Runnable {
    private String name;

    public P50Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	System.out.println("正在進行" + name + "的處理工作");
            
        }
    }
}
